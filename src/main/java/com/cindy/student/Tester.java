package com.cindy.student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("0002","Jack", 88, 70);
        stu.print();
        GraduateStudent grstu = new GraduateStudent("0001","Cindy",80,90);
        grstu.print();
    }
}
