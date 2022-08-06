package com.tilmeez.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

    public static List<Student> getStudent() {

        // create an empty list
        List<Student> students = new ArrayList<>();

        // add sample data
        students.add(new Student("Marry", "Public", "marry@gmail.com"));
        students.add(new Student("Navpreet", "Singh", "napreet@hsrw.com"));
        students.add(new Student("Habib", "Bhatti", "habib@gmail.com"));

        // return the list
        return students;
    }
}
