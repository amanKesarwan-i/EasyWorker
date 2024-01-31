package com.example.easyworker.models;

public class CartModel {

    String service_name;
    String price;
    String time;
    String userId;

    public CartModel() {
    }

    public CartModel(String service_name, String price, String time, String userId) {
        this.service_name = service_name;
        this.price = price;
        this.time = time;
        this.userId = userId;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
