package com.course.classes;

import com.course.enums.Status;
import com.course.enums.UserType;
import java.time.LocalDate;
import java.util.ArrayList;

public class Users {
    private String name, email;
    private UserType userType;
    private Status activeAccount;
    private ArrayList<Course> rolledCourses = new ArrayList<>();
    public Users(String name, String email, UserType userType, Status activeAccount){
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.activeAccount = activeAccount;
    }

    public Users(String name, String email, UserType userType, Status activeAccount, ArrayList<Course> rolledCourses) {
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.activeAccount = activeAccount;
        this.rolledCourses = rolledCourses;
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
}
