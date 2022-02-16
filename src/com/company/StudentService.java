package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class StudentService {

    HashSet<Student> studset = new HashSet<Student>();

    Student stud1 = new Student(1,"Aidar","Bilyalov");
    Student stud2 = new Student(2,"Nurniyaz","Kazaliev");
    Student stud3 = new Student(3,"Marat","Kapyshev");
    Student stud4 = new Student(4,"Nursultan","Seytnur");
    Student stud5 = new Student(5,"Nurlan","Fayzulla");
    Student stud6 = new Student(6,"Maksat","Nigmetov");
    Student stud7 = new Student(7,"Melis","Kenes");

    Scanner scanner= new Scanner(System.in);

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

    public void viewAllStud() {
        for (Student stud:studset) {
            System.out.println(stud);
        }
    }
}
