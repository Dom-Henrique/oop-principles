package com.marketingagency.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Agency {
    private String agencyName, agencyAddress, agencyContact, employName, employArea;
    int option;
    private HashMap<String, String> team = new HashMap<>();
    private HashMap<Client, Services> calendar = new HashMap<>();
    private HashMap<Services, Services> servicesList = new HashMap<>();
    private ArrayList<Client> clients = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    public String getAgencyContact() {
        return agencyContact;
    }

    public void setAgencyContact(String agencyContact) {
        this.agencyContact = agencyContact;
    }

    public void createTeam(){
         while (option != 0){
             System.out.println("Name: ");
             employName = sc.nextLine();
             System.out.println("Function: ");
             employArea = sc.nextLine();

             System.out.println("Continue?\n1 - Yes\t2 - No");
             option = sc.nextInt();
             if (option == 2) break;
         }
        if (team.size() != 0){
            System.out.println("Successful registration!");
        }
        else{
            System.out.println("There's no one team.");
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public HashMap<Client, Services> getCalendar() {
        return calendar;
    }

    public void setCalendar(HashMap<Client, Services> calendar) {
        this.calendar = calendar;
    }

    public HashMap<Services, Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(HashMap<Services, Services> servicesList) {
        this.servicesList = servicesList;
    }

    public HashMap<String, String> getTeam() {
        return team;
    }

    public void setTeam(HashMap<String, String> team) {
        this.team = team;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getEmployArea() {
        return employArea;
    }

    public void setEmployArea(String employArea) {
        this.employArea = employArea;
    }

    public String getEmployName() {
        return employName;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }
}
