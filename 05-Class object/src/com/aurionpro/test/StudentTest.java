package com.aurionpro.test;

import com.aurionpro.model.Student;

public class StudentTest {
	private static final String Mahesh = null;

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 10;
		student.name = "Mahesh";
		student.email1 = "mahesh@gmail.com";
		student.percentage = 86;

		System.out.println("name=" + student.name);
		System.out.println("name=" + student.percentage);


	}
}
