package com.course.classes;

import com.course.enums.PayMethods;
import com.course.enums.Status;
import com.course.enums.UserType;

import java.time.LocalDate;
import java.util.Random;

public class Roll extends Users{
    private int roll;
    private LocalDate registerDate;
    // Matrícula só é aprovada com o pagamento feito;
    private PayMethods payCourse;
    private Status activPay;

    public Roll(String name, String email, double cash, String password, int roll, LocalDate registerDate, PayMethods payCourse, Status activPay) {
        super(name, email, cash, password);
        this.roll = roll;
        this.registerDate = registerDate;
        this.payCourse = payCourse;
        this.activPay = activPay;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public PayMethods getPayCourse() {
        return payCourse;
    }

    public void setPayCourse(PayMethods payCourse) {
        this.payCourse = payCourse;
    }

    public Status isActivPay() {
        return activPay;
    }

    public void setActivPay(Status activPay) {
        this.activPay = activPay;
    }

    public String approvedPay(){
        if (activPay == Status.APPROVED){
            return "ROLL APPROVED.";
        }
        else{
            return "ROLL DISAPPROVED.";
        }
    }
}
