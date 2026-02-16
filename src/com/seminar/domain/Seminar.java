package com.seminar.domain;

import java.time.LocalDate;

public class Seminar {
    private String name;
    private LocalDate date;
    private Local local;

    public Seminar(String name, LocalDate date, Local local) {
        this.name = name;
        this.date = date;
        this.local = local;
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
}
