package com.electricityproject;

import java.util.ArrayList;

public class EnergyManager {
    ArrayList<Device> devices = new ArrayList<>();
    double priceKwh;
    public void addDevice(Device device){
        devices.add(device);
        System.out.println("Succesful addition!");
    }
    public double calculateAllCost(double priceKwh, int dailyHoursUse){
        double total = priceKwh*dailyHoursUse;
        System.out.println(total);
        return total;
    }
    public double allMonthConsume(double priceKwh, int monthDaysUsed){
        double total = priceKwh*monthDaysUsed;
        System.out.println(total);
        return total;
    }
    // Getters and Setters
    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public double getPriceKwh() {
        return priceKwh;
    }

    public void setPriceKwh(double priceKwh) {
        this.priceKwh = priceKwh;
    }

    @Override
    public String toString() {
        return "EnergyManager{" +
                "devices=" + devices +
                '}';
    }
}
