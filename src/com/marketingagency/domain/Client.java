package com.marketingagency.domain;

public class Client {
    private Services services;
    private String name, email, area, address, contact;
    // Constructor
    public Client(String name, String email, String area, String address, String contact) {
        this.name = name;
        this.email = email;
        this.area = area;
        this.address = address;
        this.contact = contact;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void hireService(){
        System.out.println("Services:\n" + services.getServiceName());
    }
}
