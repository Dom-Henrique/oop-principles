package com.electricityproject;

public class Device {
    private String name;
    private double wattsPotence;
    private int dailyHoursUse;
    private int monthDaysUsed;
    public Device(String name, double watssPotence, int dailyHoursUse, int monthDaysUsed){
        this.name = name;
        this.wattsPotence = watssPotence;
        this.dailyHoursUse = dailyHoursUse;
        this.monthDaysUsed = monthDaysUsed;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWattsPotence() {
        return wattsPotence;
    }

    public void setWattsPotence(double wattsPotence) {
        this.wattsPotence = wattsPotence;
    }

    public int getDailyHoursUse() {
        return dailyHoursUse;
    }

    public void setDailyHoursUse(int dailyHoursUse) {
        this.dailyHoursUse = dailyHoursUse;
    }

    public int getMonthDaysUsed() {
        return monthDaysUsed;
    }

    public void setMonthDaysUsed(int monthDaysUsed) {
        this.monthDaysUsed = monthDaysUsed;
    }
}
