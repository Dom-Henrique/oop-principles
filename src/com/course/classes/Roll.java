package com.course.classes;

import com.course.enums.PayMethods;
import com.course.enums.Status;
import com.course.enums.UserType;

import java.time.LocalDate;
import java.util.Random;

public class Roll extends Users{
    private Random roll;
    private LocalDate registerDate;
    // Matrícula só é aprovada com o pagamento feito;
    private PayCourse payCourse;
    private boolean activPay;

    public Roll(String name, String email, UserType userType, Status activeAccount, Random roll, LocalDate registerDate, PayCourse payCourse, boolean activPay) {
        super(name, email, userType, activeAccount);
        this.roll = roll;
        this.registerDate = registerDate;
        this.payCourse = payCourse;
        this.activPay = activPay;
    }

    public Random getRoll() {
        return roll;
    }

    public void setRoll(Random roll) {
        this.roll = roll;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public PayCourse getPayCourse() {
        return payCourse;
    }

    public void setPayCourse(PayCourse payCourse) {
        this.payCourse = payCourse;
    }

    public boolean isActivPay() {
        return activPay;
    }

    public void setActivPay(boolean activPay) {
        this.activPay = activPay;
    }

    public String approvedPay(){
        if (activPay == true){
            return "ROLL APPROVED.";
        }
        else{
            return "ROLL DISAPPROVED.";
        }
    }
}
