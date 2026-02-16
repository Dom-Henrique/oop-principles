package com.seminar.domain;

public class Professor {
    private String name;
    private String area;
    private Seminar[] seminars;

    public Professor(String name, String area, int maxTeams) {
        this.name = name;
        this.area = area;
        this.seminars = new Seminar[maxTeams];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
