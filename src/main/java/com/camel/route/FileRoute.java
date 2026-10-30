package com.camel.route;


import com.camel.processor.CsvToShipmentProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {

    private final CsvToShipmentProcessor csvProcessor;

    public FileRoute(
            CsvToShipmentProcessor csvProcessor) {

        this.csvProcessor = csvProcessor;
    }

    @Override
    public void configure() {

        from("file:input?noop=true")

                .routeId("file-route")

                .log("Processing file ${header.CamelFileName}")

                .split(body())

                .process(csvProcessor)

                .to("direct:shipment-processing")

                .end();
    }
}