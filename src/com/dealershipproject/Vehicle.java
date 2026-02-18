package com.dealershipproject;

public class Vehicle {
    private String brand, model, licensePlate;
    private int year;
    private Avaliable avaliable;
    private double price;
    // Constructor
    public Vehicle(String brand, String model, String licensePlate, int year, Avaliable avaliable, double price){
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
        this.avaliable = avaliable;
        this.price = price;
    }
    // Change avaliability
    public Avaliable changeAv(){
        if (avaliable.equals(Avaliable.NOTAVALIABLE)){
            return this.avaliable = Avaliable.NOTAVALIABLE;
        } else{
            return this.avaliable = Avaliable.AVALIABLE;
        }
    }
    // Getters and Setters to access the private variables
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Avaliable isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Avaliable avaliable) {
        this.avaliable = avaliable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Brand:'" + brand + '\'' +
                "\nModel:'" + model + '\'' +
                "\nLicense Plate:'" + licensePlate + '\'' +
                "\nYear:" + year +
                "\nAvaliable:" + avaliable +
                "\nPrice:" + price +
                '}';
    }
}
