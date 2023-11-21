package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class ProfessorStudentTest {
	public static void main(String[] args) {
		Student student=new Student(1,"Ujjwal",LocalDate.of(2001, 02, 05),"Comps");
		System.out.println(student);
		
		Professor professor=new Professor(2,"Rahul",LocalDate.of(2001, 04, 10),15000);
		System.out.println(professor);
	}
}
