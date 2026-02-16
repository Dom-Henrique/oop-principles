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
        Scanner sc = new Scanner(System.in);
        Seminar seminar;
        int age, maxSize, maxTeams;
        int i = 0;
        System.out.println("========== REGISTER ==========");
        // Professor
        System.out.print("Professor: ");
        String professorName = sc.nextLine();
        System.out.print("Professor Area: ");
        String professorArea = sc.nextLine();
        // Seminar
        System.out.print("Max teams: ");
        maxTeams = sc.nextInt();
        Professor professor = new Professor(professorName, professorArea, maxTeams);
        while (i < maxTeams){
            System.out.println("========== SEMINAR ==========");
            System.out.print("Seminar Name: ");
            sc.next();
            String seminarName = sc.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Date: ");
            String inputDate = sc.nextLine();
            LocalDate localDate = LocalDate.parse(inputDate, formatter);// Local
            System.out.print("Local: ");
            String address = sc.nextLine();
            Local local = new Local(address);
            seminar = new Seminar(seminarName, localDate, local, maxTeams);
            // Student
            System.out.println("========== STUDENTS ==========");
            /*
            System.out.print("Set the max size of team: ");
            maxSize = sc.nextInt();
            */
            for (int j = 0; j < maxTeams; j++){
                System.out.print("Student name: ");
                sc.next();
                String studentName = sc.nextLine();
                System.out.print("Student age: ");
                do{
                    age = sc.nextInt();
                } while(age < 5);
                Student student = new Student(studentName, age, seminar);
                seminar.getStudents()[j] = student;
            }
            professor.getSeminars()[i] = seminar;
            i++;
        }
        System.out.println("Professor: " + professor.getName() + ", " + professor.getSeminars() + " seminars\n");
    }
}
