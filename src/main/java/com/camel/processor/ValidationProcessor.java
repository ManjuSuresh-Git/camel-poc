package com.camel.processor;

import com.camel.model.ShipmentRequest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ValidationProcessor implements Processor {
    public void process(Exchange e) {
        ShipmentRequest r = e.getIn().getBody(ShipmentRequest.class);
        if (r.getShipmentId() == null || r.getShipmentId().isBlank()) throw new RuntimeException("Shipment Id Missing");
    }
}