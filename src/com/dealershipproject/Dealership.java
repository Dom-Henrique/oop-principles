package com.dealershipproject;
import java.util.ArrayList;

public class Dealership {
    private int allCustomers, allSales, allVehicles;
    private String name;
    private ArrayList<Sale> sales = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
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

    public int getAllCustomers() {
        return allCustomers;
    }

    public void setAllCustomers(int allCustomers) {
        this.allCustomers = allCustomers;
    }

    public int getAllSales() {
        return allSales;
    }

    public void setAllSales(int allSales) {
        this.allSales = allSales;
    }

    public int getAllVehicles() {
        return allVehicles;
    }

    public void setAllVehicles(int allVehicles) {
        this.allVehicles = allVehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "allCustomers=" + allCustomers +
                ", allSales=" + allSales +
                ", allVehicles=" + allVehicles +
                ", name='" + name + '\'' +
                ", sales=" + sales +
                ", vehicles=" + vehicles +
                ", customers=" + customers +
                '}';
    }
}
