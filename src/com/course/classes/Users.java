package com.course.classes;

import com.course.enums.PayMethods;
import com.course.enums.Status;
import com.course.enums.UserType;
import java.time.LocalDate;
import java.util.ArrayList;

public class Users {
    private String name, email, password;
    private UserType userType;
    private Status activeAccount;
    private ArrayList<Course> rolledCourses = new ArrayList<>();
    private double cash;
    private PayMethods payMethod;
    public Users(String name, String email, UserType userType){
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.activeAccount = Status.ACITVE;
    }

    public Users(String name, String email, double cash, String password) {
        this.name = name;
        this.email = email;
        this.activeAccount = Status.ACITVE;
        this.rolledCourses = rolledCourses;
        this.cash = cash;
        this.password = password;
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

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Status isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(Status activeAccount) {
        this.activeAccount = activeAccount;
    }

    public ArrayList<Course> getRolledCourses() {
        return rolledCourses;
    }

    public void setRolledCourses(ArrayList<Course> rolledCourses) {
        this.rolledCourses = rolledCourses;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public PayMethods getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethods payMethod) {
        this.payMethod = payMethod;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
