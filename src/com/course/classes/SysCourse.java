package com.course.classes;

import java.util.ArrayList;

// Responsável pelas listas
public class SysCourse {
    private ArrayList<Users> users = new ArrayList<>();
    private ArrayList<Roll> rolls = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();

    public ArrayList<Users> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Users> users) {
        this.users = users;
    }

    public ArrayList<Roll> getRolls() {
        return rolls;
    }

    public void setRolls(ArrayList<Roll> rolls) {
        this.rolls = rolls;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
