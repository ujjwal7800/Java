package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
	public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "ujjwal", "ujjwal@gmail.com", 85.5));
        students.add(new Student(2, "rahul", "rahul@gmail.com", 90.0));
        students.add(new Student(3, "rohit", "rohit@gmail.com", 75.2));
        
        students.add(new Student(4, "newStudent1", "newStudent1@gmail.com", 78.9));
        students.add(new Student(5, "newStudent2", "newStudent2@gmail.com", 95.5));

        return students;
    }

//	public static void main(String[] args) {
//		List<Student> studentsList = getAllStudents();
//
//		for (Student student : studentsList) {
//			System.out.println("ID: " + student.getId());
//			System.out.println("Name: " + student.getName());
//			System.out.println("Email: " + student.getEmail());
//			System.out.println("Grade: " + student.getPercentage());
//			System.out.println();
//		}
	}

