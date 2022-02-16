package com.company;

public class Student extends Person{
    private int studId;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studId=" + studId +
                '}';
    }

    public Student(int studId, String name, String lastName) {
        super();
        this.studId = studId;
        this.name= name;
        this.lastName= lastName;

    }

}


