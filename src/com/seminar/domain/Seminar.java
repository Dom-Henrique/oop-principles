package com.seminar.domain;

import java.time.LocalDate;

public class Seminar {
    private String name;
    private LocalDate date;
    private Local local;
    private Student[] students;

    public Seminar(String name, LocalDate date, Local local, int maxTeams) {
        this.name = name;
        this.date = date;
        this.local = local;
        this.students = new Student[maxTeams];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
