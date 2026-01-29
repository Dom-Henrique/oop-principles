package com.dealershipproject;

public class Customer {
    private String name, email, phone;
    private int id;
    // Constructor
    public Customer(String name, String email, String phone, int id){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(){
        this.phone = phone;
    }
    public int getId(){
        return this.id;
    }
    public void setInd(int id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "Name:'" + name + '\'' +
                "Email:'" + email + '\'' +
                "Phone:'" + phone + '\'' +
                "Id:" + id +
                '}';
    }
}
