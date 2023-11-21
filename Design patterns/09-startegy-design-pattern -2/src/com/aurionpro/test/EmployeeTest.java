package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ujjwal", new Consultant());
		System.out.println(emp.getDescription());
		System.out.println(emp.getResponsiblity());
		emp.promote(new SeniorConsultant());
		System.out.println(emp.getDescription());
		System.out.println(emp.getResponsiblity());
		

}
}
