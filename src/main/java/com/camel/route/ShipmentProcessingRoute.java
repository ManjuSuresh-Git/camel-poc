package com.camel.route;

import com.camel.processor.TransformationProcessor;
import com.camel.processor.ValidationProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ShipmentProcessingRoute
        extends RouteBuilder {

    private final ValidationProcessor validationProcessor;
    private final TransformationProcessor transformationProcessor;

    public ShipmentProcessingRoute(
            ValidationProcessor validationProcessor,
            TransformationProcessor transformationProcessor) {

        this.validationProcessor = validationProcessor;
        this.transformationProcessor = transformationProcessor;
    }

    @Override
    public void configure() {

        onException(Exception.class)
                .handled(true)
                .log("ERROR : ${exception.message}");

        from("direct:shipment-processing")

                .routeId("shipment-processing")

                .log("Shipment Received : ${body}")

                .process(validationProcessor)

                .process(transformationProcessor)

                .marshal().json()

                .setHeader(
                        Exchange.HTTP_METHOD,
                        constant("POST"))

                .setHeader(
                        Exchange.CONTENT_TYPE,
                        constant("application/json"))

                .to("http://localhost:8080/api/wms/shipments")

                .log("WMS Response : ${body}");
    }
}