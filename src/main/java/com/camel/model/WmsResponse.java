package com.camel.model;

public class WmsResponse {

    private String shipmentId;
    private String trackingId;
    private String status;

    public WmsResponse() {
    }

    public WmsResponse(
            String shipmentId,
            String trackingId,
            String status) {

        this.shipmentId = shipmentId;
        this.trackingId = trackingId;
        this.status = status;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
