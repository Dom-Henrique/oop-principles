package com.seminar.test;

import com.seminar.domain.Professor;
import com.seminar.domain.Student;
import com.seminar.domain.Seminar;
import com.seminar.domain.Local;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Usuario vai ser o professor
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("---------- Register ----------");
        // Student
        System.out.println("Student name: ");
        String studentName = sc.nextLine();
        System.out.println("Student age: ");
        do{
            age = sc.nextInt();
        } while(age < 5);
        Student student = new Student(studentName, age);
        // Professor
        System.out.println("Professor: ");
        sc.next();
        String professorName = sc.nextLine();
        System.out.println("Professor Area: ");
        String professorArea = sc.nextLine();
        Professor professor = new Professor(professorName, professorArea);
        // Seminar
        System.out.println("Seminar Name: ");
        String seminarName = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date: ");
        String inputDate = sc.nextLine();
        LocalDate localDate = LocalDate.parse(inputDate, formatter);// Local
        System.out.println("Local: ");
        String address = sc.nextLine();
        Local local = new Local(address);
        Seminar seminar = new Seminar(seminarName, localDate, local);
        // Output
        System.out.println("Seminar" + seminar.getName() + seminar.getDate() + "\n"
                + "Local" + seminar.getLocal() + "\n"
                + "Professor: " + professor.getName() + ", " + professor.getArea() + "\n"
                + "Student: " + student.getName() + ", " + student.getAge());
    }
}
