package com.electricityproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device device;
        EnergyManager energyManager = new EnergyManager();

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Watts potence: ");
        double watts = sc.nextDouble();
        int dailyHours;
        int monthsDays;
        do{
            System.out.println("Daily hours: ");
            dailyHours = sc.nextInt();
        } while(dailyHours>24);
        do{
            System.out.println("Month days used: ");
            monthsDays = sc.nextInt();
        } while(monthsDays>31);
        device = new Device(name, watts, dailyHours, monthsDays);
        energyManager.addDevice(device);
        energyManager.toString();

        System.out.println("========== MENU ==========\n1 - Calculate all costs\n2 - All month consume\n");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.println("Price (Kwh): ");
            double priceKwh = sc.nextDouble();
            energyManager.calculateAllCost(priceKwh, dailyHours);
        } else if (option == 2){
            System.out.println("Price (Kwh): ");
            double priceKwh = sc.nextDouble();
            energyManager.allMonthConsume(priceKwh, monthsDays);
        } else{
            System.out.println("valeu boi");
        }
        sc.close();
    }
}
