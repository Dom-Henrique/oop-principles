package com.course.classes;

import com.course.enums.Status;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

// Responsável pelas listas
public class SysCourse {
    private ArrayList<Users> users = new ArrayList<>();
    private ArrayList<Roll> rolls = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private HashMap<Users, Status> coursesPayed = new HashMap<>();

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

    public HashMap<Users, Status> getCoursesPayed() {
        return coursesPayed;
    }

    public void setCoursesPayed(HashMap<Users, Status> coursesPayed) {
        this.coursesPayed = coursesPayed;
    }
}
