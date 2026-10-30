package com.camel.processor;

import com.camel.model.ShipmentRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class CsvToShipmentProcessor implements Processor {
    public void process(Exchange e) {
        String[] c = e.getIn().getBody(String.class).split(",");
        ShipmentRequest r = new ShipmentRequest();
        r.setShipmentId(c[0].trim());
        r.setShipmentType(c[1].trim());
        r.setSource(c[2].trim());
        r.setDestination(c[3].trim());
        e.getMessage().setBody(r);
    }
}