package com.camel.controller;


import com.camel.model.ShipmentRequest;
import com.camel.model.WmsResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wms")
public class WarehouseController {

    @PostMapping("/shipments")
    public WmsResponse createShipment(
            @RequestBody ShipmentRequest request) {

        return new WmsResponse(
                request.getShipmentId(),
                request.getTrackingId(),
                "WMS_ACCEPTED");
    }
}
