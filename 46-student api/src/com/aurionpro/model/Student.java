package com.aurionpro.model;

import java.util.List;

public class Student 
{
	private int StudentId;
	private String Name;
	private double percentage;
	private String Hobbies;
	public Student(int studentId, String name, double percentage, String hobbies) {
		super();
		StudentId = studentId;
		Name = name;
		this.percentage = percentage;
		Hobbies = hobbies;
	}
	public Student(int studentId2, String name2, double percentage2, List<String> asList) {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String hobbies) {
		Hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Name=" + Name + ", percentage=" + percentage + ", Hobbies="
				+ Hobbies + "]";
	}
	
	
	
	

}
