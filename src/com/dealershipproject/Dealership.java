package com.dealershipproject;
import java.util.ArrayList;

public class Dealership {
    private int allCustomers, allSales, allVehicles;
    private String name;
    ArrayList<Sale> sales;
    ArrayList<Vehicle> vehicles;
    ArrayList<Customer> customers;
    // Set a name in inicialization
    public Dealership(String name){
        this.name = name;
    }
    // Methods
    public boolean addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        System.out.println("Successful addition!");
        return true;
    }
    public void removeVehicle(String licensePlate){
        if (vehicles.contains(licensePlate)){
            int index = vehicles.indexOf(licensePlate);
            vehicles.remove(index);
            System.out.println("Removed");
        }
        else{
            System.out.println("Not founded.");
        }
    }
    public void searchVehicleBrand(String brand){
        // Lopping
    }
}
