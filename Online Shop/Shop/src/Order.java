package com.company;

public class Order {
    private int orderId;
    private int customerId;
    private String dateCreated;
    private String dateShipped;
    private String status;

    public Order(int orderId, int customerId, String dateCreated, String dateShipped, String status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.status  = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerID(int customerId) {
        this.customerId = customerId;
    }



    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateShipped='" + dateShipped + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}
