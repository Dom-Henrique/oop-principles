package com.dealershipproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        Dealership dealership;
        Vehicle vehicle;
        Customer customer;
        Sale sale;
        System.out.println("Dealership name: ");
        String dsName = sc.nextLine();
        dealership = new Dealership(dsName);
        int option = 0;
        int userType = 0;
        while (userType > 0 || userType < 3) {
            System.out.println("======== DEALERSHIP SYSTEM ========\n1 - Dealership\n2 - Customer");
            userType = sc.nextInt();
            sc.nextLine();
            if (userType == 1) {
                while (option > 0 || option < 7) {
                    System.out.println("======== DEALERSHIP SYSTEM ========\n" +
                            "1 - Add Vehicle\n" +
                            "2 - Remove vehicle\n" +
                            "3 - Search vehicle by brand\n" +
                            "4 - Search vehicle by model\n" +
                            "5 - Sale release\n" +
                            "6 - See all sales\n");
                    option = sc.nextInt();
                    sc.nextLine();
                    if (option == 1) {
                        System.out.println("Brand: ");
                        String brand = sc.nextLine();
                        System.out.println("Model: ");
                        String model = sc.nextLine();
                        System.out.println("License Plate: ");
                        String licensePlate = sc.nextLine();
                        System.out.println("Year: ");
                        int year = sc.nextInt();
                        System.out.println("Avaliable (true or false): ");
                        boolean isAvaliable = sc.nextBoolean();
                        System.out.println("Price: ");
                        double price = sc.nextDouble();
                        if (isAvaliable == true){
                            vehicle = new Vehicle(brand, model, licensePlate, year, Avaliable.AVALIABLE, price);
                        }
                        else{
                            vehicle = new Vehicle(brand, model, licensePlate, year, Avaliable.NOTAVALIABLE, price);
                        }
                        dealership.addVehicle(vehicle);
                        System.out.println(dealership.getVehicles());
                    } else if (option == 2) {
                        System.out.println("License Plate: ");
                        String lpVehicle = sc.nextLine();
                        for (Vehicle v:dealership.getVehicles()){
                            if (v.getLicensePlate().equals(lpVehicle)){
                                int index = dealership.getVehicles().indexOf(v);
                                dealership.getVehicles().remove(index);
                                System.out.println("Successful remove!");
                            }
                            else{
                                System.out.println("Not Founded.");
                            }
                        }
                    } else if (option == 3) {
                        System.out.println("Brand: ");
                        String brVehicle = sc.nextLine();
                        for (Vehicle v : dealership.getVehicles()) {
                            if (v.getBrand().equals(brVehicle)) {
                                System.out.println(dealership.getVehicles());
                            }
                        }
                    } else if (option == 4) {
                        System.out.println("Model: ");
                        String mdVehicle = sc.nextLine();
                        for (Vehicle v : dealership.getVehicles()) {
                            if (v.getBrand().equals(mdVehicle)) {
                                System.out.println(dealership.getVehicles());
                            }
                        }
                    } else if (option == 5) {
                        System.out.println(dealership.getAllSales());
                    } else if (option == 6) {
                        System.out.println(dealership.getSales());
                    } else {
                        break;
                    }
                }

            } else if (userType == 2) {
                System.out.println("Your name: ");
                String name = sc.nextLine();
                System.out.println("Phone: ");
                String phone = sc.nextLine();
                System.out.println("E-mail: ");
                String email = sc.nextLine();
                int id = rd.nextInt(100000);
                System.out.println("Your id: " + id);
                customer = new Customer(name, phone, email, id);
                System.out.println(customer);
                System.out.println("======== OPTIONS ========\n" +
                        "1 - Build a vehicle\n" +
                        "2 - Delete my account\n" +
                        "3 - Exit");
                option = sc.nextInt();
                while (option > 0 && option < 7) {
                    if (option == 1) {
                        System.out.println(dealership.getVehicles());
                        System.out.println("What you want buy (license plate): " +
                                "\nExit");
                        String purshace = sc.nextLine();
                        for (Vehicle v : dealership.getVehicles()) {
                            if (v.getLicensePlate().equals(purshace)) {
                                System.out.println("Payment method: ");
                                String paymentMethod = sc.nextLine();
                                LocalDate saleDate = LocalDate.now();
                                sale = new Sale(paymentMethod, saleDate, 10.10d, v, customer);
                                System.out.println("Successful Purshace!");
                            } else {
                                System.out.println("Not Founded.");
                            }
                        }
                    } else if (option == 2) {
                        sc.nextLine();
                /*
                if (dealership.getCustomers().contains(customer)){
                    System.out.println("aaaaa");
                }
                */
                        dealership.getCustomers().remove(customer);
                        System.out.println("Deleted");
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
// Sistema de cadastro de concessionária
// Insere o nome da concessionária -> array para armazenar tudo isso
// Provavelmente um array não vai servir pra isso.
// Um controle de usuário fica interessante
// Cada tipo de usuário possui o seu próprio menu.