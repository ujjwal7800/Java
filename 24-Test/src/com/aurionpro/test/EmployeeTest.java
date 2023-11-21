package com.aurionpro.test;
import com.aurionpro.model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee m1 = new Manager(1,"Ujjwal",1000);
		printSalarySlip(m1);
		Employee d1 = new Developer(1,"Janhvi",10000);
		printSalarySlip(d1);
		Employee a1 = new Accountant(1,"Nihal",100000);
		printSalarySlip(a1);
		

	}
	
	public static void printSalarySlip(Employee e1) {
		double salary  = e1.getBasic();
		
		System.out.println(e1.calculateAnnualCTC(salary));
	
	}

}