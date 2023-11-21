package com.aurionpro.model;

import java.time.LocalDate;

public class Professor extends Person implements SalaryEmployee{

	private double salary;
	public Professor(int id, String name, LocalDate dob, double salary) {
		super(id, name, dob);
		this.salary=salary;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String toString() {
		return "Professor\n"+super.toString()+"\tsalary=" + salary + "]";
	}
	
	

}


