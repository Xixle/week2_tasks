package com.company;

public class ShippingInfo {
    private int shippingId;
    private String shippingType;
    private double shippingCost;
    private int shippingRegionId;

    public ShippingInfo(int shippingId, String shippingType, int shippingCost, int shippingRegionId) {
        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegionId = shippingRegionId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingRegionId() {
        return shippingRegionId;
    }

    public void setShippingRegion(int shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }

    @Override
    public String toString() {
        return "ShippingInfo{" +
                "shippingId=" + shippingId +
                ", shippingType='" + shippingType + '\'' +
                ", shippingCost=" + shippingCost +
                ", shippingRegionId=" + shippingRegionId +
                '}';
    }
}
