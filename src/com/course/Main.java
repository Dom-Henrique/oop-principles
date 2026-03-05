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
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;

public class Main implements CRUD {
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
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Course course;
        // Sempre inicializar os Enums como nulos
        Status status = null;
        Category category = null;
        SysCourse sys = new SysCourse();
        String username, email, title, description, coach, idk, password;
        Roll roll;
        double price, cash;
        int loginOption, typeUser, menuOption, option = 0;
        UserType userType;
        Users user;
        while (true) {
            do {
                System.out.println("========== LOGIN AREA ==========");
                System.out.println("1 - Sign Up\t2 - Log In");
                loginOption = sc.nextInt();
            } while (loginOption != 1 && loginOption != 2);
            if (loginOption == 1) {
                do {
                    sc.nextLine();
                    System.out.print("Username: ");
                    username = sc.nextLine();
                } while (username.length() < 2);
                do {
                    System.out.print("E-mail: ");
                    email = sc.nextLine();
                } while (!email.contains("@") && !email.contains(".com"));
                do {
                    System.out.print("Password: ");
                    password = sc.nextLine();
                } while (password.length() < 8);
                System.out.print("Cash: ");
                cash = sc.nextDouble();
                user = new Users(username, email, cash, password);
                sys.getUsers().add(user);
                System.out.print("User type:\n1 - Manager\t2 - Customer\n");
                do {
                    typeUser = sc.nextInt();
                } while (typeUser != 1 && typeUser != 2);
                if (typeUser == 1) {
                    user.setUserType(UserType.ADM);
                } else {
                    user.setUserType(UserType.CLIENT);
                }
            } else {
                sc.nextLine();
                do {
                    System.out.print("E-mail: ");
                    email = sc.nextLine();
                } while (!email.contains("@") && !email.contains(".com"));
                do {
                    System.out.print("Password: ");
                    password = sc.nextLine();
                } while (password.length() < 8);
                for (Users u : sys.getUsers()) {
                    if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                        System.out.println("WELCOME, " + u.getName() + "!");
                        if (u.getUserType() == UserType.ADM) {
                            System.out.println("========== MANAGER SYSTEM ==========");
                            System.out.println("1 - CREATE COURSE\n2 - LIST USERS\n3 - PRINT REPORTS\n4 - LIST COURSES\n5 - DEACTIVATE ACCOUNT\n6 - SEARCH COURSE");
                            menuOption = sc.nextInt();
                            if (menuOption == 1) {
                                System.out.println("========== CREATE COURSE ==========");
                                System.out.print("Title: ");
                                sc.nextLine();
                                title = sc.nextLine().toUpperCase();
                                System.out.print("Description: ");
                                description = sc.nextLine();
                                System.out.print("Coach: ");
                                coach = sc.nextLine();
                                System.out.print("Price: ");
                                price = sc.nextDouble();
                                while (true) {
                                    System.out.print("Category (PERSONAL_DEVELOPMENT, PROGRAMMING, ART, MARKETING, SEX_APPEAL): ");
                                    sc.nextLine();
                                    idk = sc.nextLine().toUpperCase();
                                    if (idk.equals("PERSONAL DEVELOPMENT") || idk.equals("PERSONAL_DEVELOPMENT")) {
                                        category = Category.PERSONAL_DEVELOPMENT;
                                        break;
                                    } else if (idk.equals("PROGRAMMING")) {
                                        category = Category.PROGRAMMING;
                                        break;
                                    } else if (idk.equals("ART")) {
                                        category = Category.ART;
                                        break;
                                    } else if (idk.equals("MARKETING")) {
                                        category = Category.MARKETING;
                                        break;
                                    } else if (idk.equals("SEX_APPEAL") || idk.equals("SEXAPPEAL")) {
                                        category = Category.SEX_APPEAL;
                                        break;
                                    } else {
                                        System.out.println("Cannot register");
                                    }
                                }
                                status = Status.DRAFT;
                                course = new Course(title, description, price, coach, category, status);
                                System.out.println("========== COURSE MENU ==========");
                                System.out.println("1 - PUBLIC COURSE\n2 - UPDATE INFORMATIONS\n3 - ARCHIVE COURSE");
                                option = sc.nextInt();
                                if (option == 1) {
                                    course.setStatus(Status.PUBLISHED);
                                    if (course.getStatus() != Status.UNACTIVE) {
                                        sys.getCourses().add(course);
                                    }
                                    System.out.println("PUBLISHED!");
                                } else if (option == 2) {
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
                                    if (idk.equals("PERSONAL DEVELOPMENT") || idk.equals("PERSONAL_DEVELOPMENT")) {
                                        category = Category.PERSONAL_DEVELOPMENT;
                                    } else if (idk.equals("PROGRAMMING")) {
                                        category = Category.PROGRAMMING;
                                    } else if (idk.equals("ART")) {
                                        category = Category.ART;
                                    } else if (idk.equals("MARKETING")) {
                                        category = Category.MARKETING;
                                    } else if (idk.equals("SEX_APPEAL") || idk.equals("SEXAPPEAL")) {
                                        category = Category.SEX_APPEAL;
                                    } else {
                                        System.out.println("Cannot register");
                                    }
                                    course.setTitle(title);
                                    course.setDescription(description);
                                    course.setCategory(category);
                                    course.setCoach(coach);
                                    course.setStatus(status);
                                    course.setPrice(price);
                                    System.out.println("UPDATED!");
                                } else if (option == 3) {
                                    course.setStatus(Status.ARCHIVED);
                                    System.out.println("ARCHIVED!");
                                }
                            } else if (menuOption == 2) {
                                if (!sys.getUsers().isEmpty()) {
                                    System.out.println("========== LIST OF USERS ==========");
                                    for (Users us : sys.getUsers()) {
                                        System.out.println(us.getName());
                                    }
                                } else {
                                    System.out.println("NOT USERS!");
                                }
                            } else if (menuOption == 3) {
                                System.out.println("ihu");
                            } else if (menuOption == 4) {
                                System.out.println("========== LIST OF COURSES ==========");
                                if (!sys.getCourses().isEmpty()) {
                                    for (Course c : sys.getCourses()) {
                                        System.out.println(c.getTitle());
                                    }
                                } else {
                                    System.out.println("NOT COURSES");
                                }
                            } else if (menuOption == 5) {
                                u.setActiveAccount(Status.UNACTIVE);
                                System.out.println("Account deactivated!");
                            } else if (menuOption == 6) {
                                System.out.print("COURSE TITLE: ");
                                sc.nextLine();
                                String courseTitle = sc.nextLine().toUpperCase();
                                for (Course c : sys.getCourses()) {
                                    if (c.getTitle().equals(courseTitle)) {
                                        System.out.println(c);
                                        System.out.println("========== COURSE MENU ==========");
                                        System.out.println("1 - PUBLIC COURSE\n2 - UPDATE INFORMATIONS\n3 - ARCHIVE COURSE\n4 - EXIT");
                                        option = sc.nextInt();
                                        if (option == 1) {
                                            c.setStatus(Status.PUBLISHED);
                                            if (c.getStatus() != Status.UNACTIVE) {
                                                sys.getCourses().add(c);
                                            }
                                            System.out.println("PUBLISHED!");
                                        } else if (option == 2) {
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
                                            if (idk.equals("PERSONAL DEVELOPMENT") || idk.equals("PERSONAL_DEVELOPMENT")) {
                                                category = Category.PERSONAL_DEVELOPMENT;
                                            } else if (idk.equals("PROGRAMMING")) {
                                                category = Category.PROGRAMMING;
                                            } else if (idk.equals("ART")) {
                                                category = Category.ART;
                                            } else if (idk.equals("MARKETING")) {
                                                category = Category.MARKETING;
                                            } else if (idk.equals("SEX_APPEAL") || idk.equals("SEXAPPEAL")) {
                                                category = Category.SEX_APPEAL;
                                            } else {
                                                System.out.println("Cannot register");
                                            }
                                            c.setTitle(title);
                                            c.setDescription(description);
                                            c.setCategory(category);
                                            c.setCoach(coach);
                                            c.setStatus(status);
                                            c.setPrice(price);
                                            System.out.println("UPDATED!");
                                        } else if (option == 3) {
                                            c.setStatus(Status.ARCHIVED);
                                            System.out.println("ARCHIVED!");
                                        } else if (option == 4) {
                                            break;
                                        }
                                    } else {
                                        System.out.println("NOT FOUNDED!");
                                    }
                                }
                            }
                        } else if (u.getUserType() == UserType.CLIENT) {
                            while (true) {
                                System.out.println("========== COURSE STORE ==========");
                                System.out.println("1 - BUY COURSE\n2 - EXIT");
                                menuOption = sc.nextInt();
                                if (menuOption == 1) {
                                    System.out.println("========== COURSES ==========");
                                    if (!sys.getCourses().isEmpty()) {
                                        System.out.println(sys.getCourses());
                                        System.out.print("Chosse one option (title): ");
                                        sc.nextLine();
                                        String chosseCourse = sc.nextLine().toUpperCase();
                                        for (Course c : sys.getCourses()) {
                                            if (c.getTitle().equals(chosseCourse) && c.getStatus() == Status.PUBLISHED) {
                                                System.out.println("========== CHOOSED COURSE: " + chosseCourse + " ==========");
                                                System.out.println("========== AVALIATIONS " + c.getAvaliations() + " ==========");
                                                int pay = 0;
                                                do {
                                                    System.out.println("Payment Method:\n1 - PayPal\t2 - Credit\t3 - Debit");
                                                    pay = sc.nextInt();
                                                } while (pay != 1 && pay != 2 && pay != 3);
                                                if (u.getCash() >= c.getPrice()) {
                                                    if (pay == 1) {
                                                        u.setPayMethod(PayMethods.PAYPAL);
                                                        sys.getCoursesPayed().put(u, Status.APPROVED);
                                                        int userRoll = random.nextInt(999999 - 100000 + 1) + 100000;
                                                        roll = new Roll(u.getName(), email, c.getPrice(), password, userRoll, LocalDate.now(), PayMethods.PAYPAL, Status.ACITVE);
                                                        System.out.println("Avaliate course?\n1 - Yes\t2 - No");
                                                        menuOption = sc.nextInt();
                                                        if (menuOption == 1) {
                                                            double note;
                                                            do {
                                                                System.out.print("Note (1-5): ");
                                                                note = sc.nextDouble();
                                                            } while (note <= 5.0 && note >= 1.0);
                                                            sys.getAvaliations().push(note);
                                                            System.out.println("Avaliation added!");
                                                        } else {
                                                            return;
                                                        }
                                                    } else if (pay == 2) {
                                                        u.setPayMethod(PayMethods.CREDIT_CARD);
                                                        sys.getCoursesPayed().put(u, Status.APPROVED);
                                                        int userRoll = random.nextInt(999999 - 100000 + 1) + 100000;
                                                        roll = new Roll(u.getName(), email, c.getPrice(), password, userRoll, LocalDate.now(), PayMethods.CREDIT_CARD, Status.ACITVE);
                                                        System.out.println("Avaliate course?\n1 - Yes\t2 - No");
                                                        menuOption = sc.nextInt();
                                                        if (menuOption == 1) {
                                                            double note;
                                                            do {
                                                                System.out.print("Note (1-5): ");
                                                                note = sc.nextDouble();
                                                            } while (note <= 5 && note >= 1);
                                                            sys.getAvaliations().push(note);
                                                            System.out.println("Avaliation added!");
                                                        } else {
                                                            return;
                                                        }
                                                    } else if (pay == 3) {
                                                        u.setPayMethod(PayMethods.CREDIT_CARD);
                                                        sys.getCoursesPayed().put(u, Status.APPROVED);
                                                        int userRoll = random.nextInt(999999 - 100000 + 1) + 100000;
                                                        roll = new Roll(u.getName(), email, c.getPrice(), password, userRoll, LocalDate.now(), PayMethods.DEBIT_CARD, Status.ACITVE);
                                                        System.out.println("Avaliate course?\n1 - Yes\t2 - No");
                                                        menuOption = sc.nextInt();
                                                        if (menuOption == 1) {
                                                            double note;
                                                            do {
                                                                System.out.print("Note (1-5): ");
                                                                note = sc.nextDouble();
                                                            } while (note < 5 && note > 1);
                                                            sys.getAvaliations().push(note);
                                                            System.out.println("Avaliation added!");
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("LOW CASH");
                                                }
                                            } else {
                                                System.out.println("ERROR 404");
                                            }
                                        }
                                    } else {
                                        System.out.println("COME BACK SOON!");
                                        break;
                                    }
                                } else if (menuOption == 2) {
                                    break;
                                }
                            }

                        } else if (u.isActiveAccount().equals(Status.UNACTIVE)) {
                            System.exit(0);
                        }
                    } else {
                        System.out.println("TRY AGAIN");
                    }
                }
            }
        }
    }
}
