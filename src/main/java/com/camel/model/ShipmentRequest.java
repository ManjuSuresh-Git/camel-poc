package com.camel.model;

public class ShipmentRequest {
    private String shipmentId, shipmentType, source, destination, trackingId;

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String v) {
        shipmentId = v;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String v) {
        shipmentType = v;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String v) {
        source = v;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String v) {
        destination = v;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String v) {
        trackingId = v;
    }
}