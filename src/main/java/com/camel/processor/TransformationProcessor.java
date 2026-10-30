package com.camel.processor;

import com.camel.model.ShipmentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class TransformationProcessor implements Processor {
    public void process(Exchange e) {
        ShipmentRequest r = e.getIn().getBody(ShipmentRequest.class);
        r.setTrackingId("TRK-" + r.getShipmentId());
        e.getMessage().setBody(r);
    }
}