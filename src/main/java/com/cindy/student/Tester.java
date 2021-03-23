package com.cindy.student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("jack",88,90);
        GraduateStudent grstu = new GraduateStudent();
        stu.print();
        //grstu.print();
    }
}