package com.camel.controller;

import com.camel.model.ShipmentRequest;
import org.apache.camel.ProducerTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    private final ProducerTemplate producerTemplate;

    public ShipmentController(
            ProducerTemplate producerTemplate) {

        this.producerTemplate = producerTemplate;
    }


    @PostMapping(
            value = "/ship",
            produces = "application/json",
            consumes = "application/json")
    public ResponseEntity<String> createShipment(
            @RequestBody ShipmentRequest request) {

        String response = producerTemplate.requestBody(
                "direct:shipment-processing",
                request,
                String.class);

        return ResponseEntity.ok(response);
    }
}