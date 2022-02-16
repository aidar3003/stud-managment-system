package com.company;

import java.util.Scanner;

public class Main {

    StudentService studService = new StudentService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("****Welcome To Student Management System*******"
                + "\n1. Add Student "
                + "\n2. View Student "
                + "\n3. Update Student "
                + "\n4. Delete Student "
                + "\n5. View All Students "
                + "\n6. Exit ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        do {
            menu();
            System.out.println("Enter Your Choice");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Add Student");
                    break;
                case 2:
                    System.out.println("View Student");
                    break;
                case 3:
                    System.out.println("Update Student");
                    break;
                case 4:
                    System.out.println("Delete Student");
                    break;
                case 5:
                    System.out.println("View All Students");
                    service.viewAllStud();
                    break;
                case 6:
                    System.out.println("Thank you for using Student Management System!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice");

            }
        }
        while(ordering); {

        }

    }
}
