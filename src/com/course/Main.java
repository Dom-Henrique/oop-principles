package com.course;

import com.course.classes.Course;
import com.course.classes.Users;
import com.course.classes.Roll;
import com.course.enums.Category;
import com.course.enums.PayMethods;
import com.course.enums.Status;
import com.course.classes.SysCourse;
import com.course.enums.UserType;
import com.course.interfaces.CRUD;

import java.util.Scanner;

public class Main implements CRUD{
    @Override
    public void buyCourse(Course course, Users user) {
        user.getRolledCourses().add(course);
        System.out.println("Registred!");
    }

    @Override
    public void avaliateCourse(Course course, float avaliation) {
        course.getUsersAvaliations().add(avaliation);
    }

    @Override
    public void updateInformations() {

    }

    @Override
    public void pushCourse(Course course) {

    }

    @Override
    public void listCategory(Category category) {

    }

    @Override
    public void searchKeyWord() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course course;
        // Sempre inicializar os Enums como nulos
        Status status = null;
        Category category = null;
        SysCourse sys = new SysCourse();
        String username, email;
        // Login Area
        do{
            System.out.print("Username: ");
            username = sc.nextLine();
        }while(username.length() < 2);
        do{
            System.out.print("E-mail: ");
            email = sc.nextLine();
        }while(!email.contains("@") && !email.contains(".com"));
        System.out.print("Cash: ");
        double cash = sc.nextDouble();
        int typeUser = 0;
        UserType userType;
        System.out.print("User type:\n1 - Manager\t2 - Customer\n");
        do{typeUser = sc.nextInt();}while (typeUser != 1 && typeUser != 2);
        if (typeUser == 1){
            userType = UserType.ADM;
        }
        else{
            userType = UserType.CLIENT;
        }
        Users user = new Users(username, email, userType, Status.ACITVE, cash);
        sys.getUsers().add(user);
        while (true){
            int option;
            int menuOption;
            if (user.getUserType() == UserType.ADM){
                while (true){
                    System.out.println("========== MANAGER SYSTEM ==========");
                    System.out.println("1 - Create course\n2 - List users\n3 - Print Reports\n");
                    menuOption = sc.nextInt();
                    if (menuOption == 1){
                        System.out.println("========== CREATE COURSE ==========");
                        System.out.print("Title: ");
                        sc.next();
                        String title = sc.nextLine().toUpperCase();
                        System.out.print("Description: ");
                        String description = sc.nextLine();
                        System.out.print("Coach: ");
                        String coach = sc.nextLine();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        sc.next();
                        String idk;
                        while (true){
                            System.out.print("Category (PERSONAL_DEVELOPMENT, PROGRAMMING, ART, MARKETING, SEX_APPEAL): ");
                            idk = sc.nextLine().toUpperCase();
                            if (idk.equals("PERSONAL DEVELOPMENT") || idk.equals("PERSONAL_DEVELOPMENT")){
                                category = Category.PERSONAL_DEVELOPMENT;
                                break;
                            }
                            else if (idk.equals("PROGRAMMING")){
                                category = Category.PROGRAMMING;
                                break;
                            }
                            else if (idk.equals("ART")){
                                category = Category.ART;
                                break;
                            }
                            else if (idk.equals("MARKETING")){
                                category = Category.MARKETING;
                                break;
                            }
                            else if (idk.equals("SEX_APPEAL") || idk.equals("SEXAPPEAL")){
                                category = Category.SEX_APPEAL;
                                break;
                            }
                            else{
                                System.out.println("Cannot register");
                            }
                        }
                        System.out.print("Status (true or false): ");
                        boolean stCourse = sc.nextBoolean();
                        if (stCourse){
                            status = Status.ACITVE;
                        }
                        else{
                            status = Status.UNACTIVE;
                        }
                        course = new Course(title, description, price, coach, category, status);
                        if (course.getStatus() != Status.UNACTIVE){
                            sys.getCourses().add(course);
                        }
                        System.out.println("========== COURSE MENU ==========");
                        System.out.println("1 - PUBLIC COURSE\n2 - UPDATE INFORMATIONS\n3 - EXIT");
                        option = sc.nextInt();
                        if (option == 1){
                            course.publicInformations(course);
                        }
                        else if (option == 2){
                            System.out.print("Title: ");
                            title = sc.nextLine();
                            System.out.print("Description: ");
                            description = sc.nextLine();
                            System.out.print("Coach: ");
                            coach = sc.nextLine();
                            System.out.print("Price: ");
                            price = sc.nextDouble();
                            System.out.print("Category (PERSONAL_DEVELOPMENT, PROGRAMMING, ART, MARKETING, SEX_APPEAL): ");
                            idk = sc.nextLine().toUpperCase();
                            if (idk.equals("PERSONAL DEVELOPMENT") || idk.equals("PERSONAL_DEVELOPMENT")){
                                category = Category.PERSONAL_DEVELOPMENT;
                            }
                            else if (idk.equals("PROGRAMMING")){
                                category = Category.PROGRAMMING;
                            }
                            else if (idk.equals("ART")){
                                category = Category.ART;
                            }
                            else if (idk.equals("MARKETING")){
                                category = Category.MARKETING;
                            }
                            else if (idk.equals("SEX_APPEAL") || idk.equals("SEXAPPEAL")){
                                category = Category.SEX_APPEAL;
                            }
                            else{
                                System.out.println("Cannot register");
                            }
                            System.out.print("Status (true or false): ");
                            stCourse = sc.nextBoolean();
                            if (stCourse){
                                status = Status.ACITVE;
                            }
                            else{
                                status = Status.UNACTIVE;
                            }
                            course.setTitle(title);
                            course.setDescription(description);
                            course.setCategory(category);
                            course.setCoach(coach);
                            course.setStatus(status);
                            System.out.println("UPDATED!");
                        }
                    }
                    else if (menuOption == 2){
                        if (!sys.getUsers().isEmpty()){
                            System.out.println("========== LIST OF USERS ==========");
                            System.out.println(sys.getUsers());
                        }
                        else{
                            System.out.println("NOT USERS!");
                        }
                    }
                    else if (menuOption == 3){
                        break;
                    }
                }
            }
            else if (user.getUserType() == UserType.CLIENT){
                System.out.println("========== COURSES ==========");
                if (!sys.getCourses().isEmpty()){
                    System.out.println(sys.getCourses());
                    System.out.print("Chosse one option (title): ");
                    sc.next();
                    String chosseCourse = sc.nextLine().toUpperCase();
                    for (Course c : sys.getCourses()){
                        if (c.getTitle().equals(chosseCourse)){
                            System.out.println("========== CHOOSED COURSE: " + chosseCourse + " ==========");
                            int pay = 0;
                            do{
                                System.out.println("Payment Method:\n1 - PayPal\t2 - Credit\t3 - Debit");
                                pay = sc.nextInt();
                            }while (pay!=1 && pay!=2 && pay!=3);
                            if (cash >= c.getPrice()){
                                if (pay == 1){
                                    user.setPayMethod(PayMethods.PAYPAL);
                                    sys.getCoursesPayed().put(user, Status.APPROVED);
                                    System.out.println("Show de bola");
                                }
                                else if(pay == 2){
                                    user.setPayMethod(PayMethods.CREDIT_CARD);
                                    sys.getCoursesPayed().put(user, Status.APPROVED);
                                    System.out.println("Show de bola");
                                }
                                else if(pay == 3){
                                    user.setPayMethod(PayMethods.CREDIT_CARD);
                                    sys.getCoursesPayed().put(user, Status.APPROVED);
                                    System.out.println("Show de bola");
                                }
                            }
                            else{
                                System.out.println("LOW CASH");
                            }
                        }
                        else{
                            System.out.println("ERROR 404");
                        }
                    }
                }
                else{
                    System.out.println("COME BACK SOON!");
                    break;
                }
            }
            else{
                System.out.println("INVALID OPTION!");
            }
        }
    }
}
