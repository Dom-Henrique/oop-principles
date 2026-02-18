package com.dealershipproject;

public class Motobike extends Vehicle{
    String bikeName;
    public Motobike(Vehicle vehicle, String bikeName){
        super(vehicle.getBrand(), vehicle.getModel(), vehicle.getLicensePlate(), vehicle.getYear(), vehicle.isAvaliable(), vehicle.getPrice());
        this.bikeName = bikeName;
    }
}
