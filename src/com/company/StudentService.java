package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class StudentService {

    HashSet<Student> studset = new HashSet<>();

    Student stud1 = new Student(1,"Aidar","Bilyalov");
    Student stud2 = new Student(2,"Nurniyaz","Kazaliev");
    Student stud3 = new Student(3,"Marat","Kapyshev");
    Student stud4 = new Student(4,"Nursultan","Seytnur");
    Student stud5 = new Student(5,"Nurlan","Fayzulla");
    Student stud6 = new Student(6,"Maksat","Nigmetov");
    Student stud7 = new Student(7,"Melis","Kenes");

    Scanner scanner= new Scanner(System.in);
    boolean found = false;
    int studId;
    String name;
    String lastName;

    public StudentService() {
        studset.add(stud1);
        studset.add(stud2);
        studset.add(stud3);
        studset.add(stud4);
        studset.add(stud5);
        studset.add(stud6);
        studset.add(stud7);
    }

    //Add student
    public void addStudent() {
        System.out.println("Enter id: ");
        studId=scanner.nextInt();
        System.out.println("Enter name: ");
        name=scanner.next();
        System.out.println("Enter last name: ");
        lastName=scanner.next();

        Student student = new Student(studId, name, lastName);
        studset.add(student);
        System.out.println(student);
        System.out.println("Added successfully");


    }

    //View all students
    public void viewAllStud() {
        for (Student stud:studset) {
            System.out.println(stud);
        }
    }

    //View student based on ID
    public void viewStudent() {
        boolean found = false;
        System.out.println("Enter id: ");
        studId=scanner.nextInt();
        for (Student student:studset) {
            if (student.getStudId()==studId) {
                System.out.println(student);
                found=true;
            }
        }
        if (!found) {
            System.out.println("Student with this id is not exist");
        }
    }

    //Update the student
    public void updateStudent() {
        System.out.println("Enter id: ");
        studId=scanner.nextInt();
        boolean found = false;
        for (Student student:studset) {
            if (student.getStudId()==studId) {
                System.out.println("Enter name: ");
                name = scanner.next();
                System.out.println("Enter last name");
                lastName = scanner.next();
                student.setName(name);
                student.setLastName(lastName);
                student.setStudId(studId);
                System.out.println("Updated details of student are: ");
                System.out.println(student);
                found=true;
            }
        }
        if (!found) {
            System.out.println("Student is not exist");
        }
        else {
            System.out.println("Updated successfully");
        }
    }

    //Delete the student
    public void deleteStudent() {
        System.out.println("Enter id: ");
        studId=scanner.nextInt();
        Student studDelete = null;
        for (Student student:studset) {
            if (student.getStudId()==studId) {
                studDelete = student;
                found=true;
            }
        }
        if (!found) {
            System.out.println("Student is not exist");
        }
        else {
            studset.remove(studDelete);
            System.out.println("Deleted successfully");
        }
    }

}
