package com.cindy;

import com.cindy.student.Student;

public class Score {
    public static void main(String[] args) {
        Student stu1 = new Student("Cindy", 40, 75);
        int average = stu1.average();
        System.out.println(average);
        if (average < 60) {
            System.out.println("I am sorry");
        } else {
            System.out.println("Congradulation!");

        }
        stu1.print();
    }

}
