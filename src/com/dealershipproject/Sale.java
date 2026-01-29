package com.dealershipproject;

public class Sale {
    private String paymentMethod, saleDate;
    private double saleValue;
    Vehicle vehicle;
    Customer customer;
    public Sale(String paymentMethod, String saleDate, double saleValue, Vehicle vehicle, Customer customer){
        this.paymentMethod = paymentMethod;
        this.saleDate = saleDate;
        this.saleValue = saleValue;
        this.vehicle = vehicle;
        this.customer = customer;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public double getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(double saleValue) {
        this.saleValue = saleValue;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "Payment Method:'" + paymentMethod + '\'' +
                "\nSale Date:'" + saleDate + '\'' +
                "\nSale Value:" + saleValue +
                "\nVehicle:" + vehicle +
                "\nCustomer:" + customer +
                '}';
    }
}
