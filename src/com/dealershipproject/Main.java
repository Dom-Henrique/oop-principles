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
        System.out.println("======== DEALERSHIP SYSTEM ========\n1 - Dealership\n2 - Customer");
        int userType = sc.nextInt();
        sc.nextLine();
        if (userType == 1){
            System.out.println("1 - Add Vehicle" +
                    "2 - Remove vehicle" +
                    "3 - Search vehicle by brand" +
                    "4 - Search vehicle by model" +
                    "5 - Sale release" +
                    "6 - See all sales");
            int option = sc.nextInt();
            sc.nextLine();
            if (option==1) {
                System.out.println("Brand: ");
                String brand = sc.nextLine();
                System.out.println("Model: ");
                String model = sc.nextLine();
                System.out.println("License Plate: ");
                String licensePlate = sc.nextLine();
                System.out.println("Year: ");
                int year = sc.nextInt();
                System.out.println("Avaliable (true or false): ");
                boolean avaliable = sc.hasNext();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                vehicle = new Vehicle(brand, model, licensePlate, year, avaliable, price);
                dealership.addVehicle(vehicle);
                System.out.println("Vehicle added!");
                dealership.getVehicles().toString();
            }
            else if (option==2) {
                System.out.println("License Plate: ");
                String lpVehicle = sc.nextLine();
                if (dealership.getVehicles().contains(lpVehicle)) {
                    int index = dealership.getVehicles().indexOf(lpVehicle);
                    dealership.getVehicles().remove(index);
                    dealership.getVehicles().toString();
                } else {
                    System.out.println("Not founded");
                }
            }
            else if (option==3) {
                System.out.println("Brand: ");
                String brVehicle = sc.nextLine();
                if (dealership.getVehicles().contains(brVehicle)) {
                    for ( Vehicle v : dealership.getVehicles() ) {
                        if (v.getBrand().equals(brVehicle)){
                            System.out.println(dealership.getVehicles());
                        }
                    }
                } else {
                    System.out.println("Not founded");
                }
            }
            else if (option==4){
                    System.out.println("Model: ");
                    String mdVehicle = sc.nextLine();
                    if (dealership.getVehicles().contains(mdVehicle)){
                        // Pra percorrer precisa ser do mesmo tipo
                        for ( Vehicle v : dealership.getVehicles() ){
                            if (v.getBrand().equals(mdVehicle)) {
                                System.out.println(dealership.getVehicles());
                            }
                        }
                    } else{
                        System.out.println("Not founded");
                    }
            }
        }
        else if (userType==2){
            System.out.println("Your name: ");
            String name = sc.nextLine();
            System.out.println("Phone: ");
            String phone = sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            int id = rd.nextInt(100000);
            System.out.println("Your id: " + id);
            customer = new Customer(name, phone, email, id);
            customer.toString();
            System.out.println("======== OPTIONS ========\n" +
                    "1 - Build a vehicle\n" +
                    "2 - Delete my account");
            int option = sc.nextInt();

            if (option==1) {
                System.out.println(dealership.getVehicles().toString());
                System.out.println("What you want buy (license plate): ");
                String purshace = sc.nextLine();
                if (dealership.getVehicles().contains(purshace)) {
                    int index = dealership.getVehicles().indexOf(purshace);
                    Vehicle buyVehicle = dealership.getVehicles().get(index);
                    System.out.println("Payment method: ");
                    String paymentMethod = sc.nextLine();
                    LocalDate saleDate = LocalDate.now();
                    sale = new Sale(paymentMethod, saleDate, 10.10d, buyVehicle, customer);
                    System.out.println("Successful Purshace!");
                }
            }
            else if(option==2){
                sc.nextLine();
                /*
                if (dealership.getCustomers().contains(customer)){
                    System.out.println("aaaaa");
                }
                */
                dealership.getCustomers().remove(customer);
                System.out.println("Deleted");
            }
        }
    }
}
// Sistema de cadastro de concessionária
// Insere o nome da concessionária -> array para armazenar tudo isso
// Provavelmente um array não vai servir pra isso.
// Um controle de usuário fica interessante
// Cada tipo de usuário possui o seu próprio menu.