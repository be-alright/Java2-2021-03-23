package com.cindy.student;

public class Student {
    String name;
    int math;              //屬性
    int english;


    public Student(String name, int math, int english) {
        this.name = name;                                 //建構子
        this.math = math;
        this.english = english;
    }

    public Student() {
        super();
    }

    public int average() {
        return (math + english) / 2;

    }

    public void print() {
        System.out.println(name + "\t" + math + "\t" + english + "\t" + average());

    }

}
