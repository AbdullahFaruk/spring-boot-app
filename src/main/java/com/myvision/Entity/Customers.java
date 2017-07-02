package com.myvision.Entity;

/**
 * Created by shawon on 7/1/17.
 */
public class Customers {

    private int customerId;
    private String customerName;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private int orderId;
    private String products;
    private int quantity;


    public Customers(int customerId, String customerName, String address, String city, String postalCode, String country, int orderId, String products, int quantity){
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.orderId = orderId;
        this.products = products;
        this.quantity = quantity;

    }

    public Customers(){

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
