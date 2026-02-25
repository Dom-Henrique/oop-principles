package com.course.classes;

import com.course.enums.Category;
import com.course.enums.Status;
import java.util.ArrayList;

public class Course {
    private String title, description, coach;
    private double price;
    private Category category;
    private Status status;
    private ArrayList<Users> enrolledStudents = new ArrayList<>();
    private float avaliations;
    private ArrayList<Float> usersAvaliations = new ArrayList<>();

    public Course(String title, String description, double price, String coach, Category category, Status status) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.coach = coach;
        this.category = category;
        this.status = status;
    }

    public Course(Status status, Category category, double price, String coach, String description, String title, float avaliations) {
        this.status = status;
        this.category = category;
        this.price = price;
        this.coach = coach;
        this.description = description;
        this.title = title;
        this.avaliations = avaliations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ArrayList<Users> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Users> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public float getAvaliations() {
        return avaliations;
    }

    public void setAvaliations(float avaliations) {
        this.avaliations = avaliations;
    }

    public ArrayList<Float> getUsersAvaliations() {
        return usersAvaliations;
    }

    public void setUsersAvaliations(ArrayList<Float> usersAvaliations) {
        this.usersAvaliations = usersAvaliations;
    }

    public Status publicInformations(Course course){
        if(course.getStatus() == Status.UNACTIVE){
            course.setStatus(Status.ACITVE);
        }
        return course.getStatus();
    }
}
