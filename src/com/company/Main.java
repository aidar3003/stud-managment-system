package com.company;

import java.util.Scanner;

public class Main {

    StudentService studService = new StudentService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("""
                ****Welcome To Student Management System*******
                1. Add Student\s
                2. View Student\s
                3. Update Student\s
                4. Delete Student\s
                5. View All Students\s
                6. Exit\s""");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        do {
            menu();
            System.out.println("Enter Your Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Student");
                    service.addStudent();
                }
                case 2 -> {
                    System.out.println("View Student");
                    service.viewStudent();
                }
                case 3 -> {
                    System.out.println("Update Student");
                    service.updateStudent();
                }
                case 4 -> {
                    System.out.println("Delete Student");
                    service.deleteStudent();
                }
                case 5 -> {
                    System.out.println("View All Students");
                    service.viewAllStud();
                }
                case 6 -> {
                    System.out.println("Thank you for using Student Management System!");
                    System.exit(0);
                }
                default -> System.out.println("Please enter valid choice");
            }
        }
        while(ordering); {

        }

    }
}
