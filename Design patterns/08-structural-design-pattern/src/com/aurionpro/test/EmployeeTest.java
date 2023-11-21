package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.EmployeeDirectory;
import com.aurionpro.model.IEmployee;
import com.aurionpro.model.Manager;

public class EmployeeTest {
	public static void main(String[] args) {
		IEmployee dev1=new Developer("Nikul","Senior Developer");
		IEmployee dev2=new Developer("Jigna","Developer");
		
		EmployeeDirectory devDirectory=new EmployeeDirectory();
		devDirectory.addEmployee(dev1);
		devDirectory.addEmployee(dev2);
		
		IEmployee manager1=new Manager("Rajesh","Manager");
		IEmployee manager2=new Manager("Jigna","Manager");
		
		EmployeeDirectory managerDirectory=new EmployeeDirectory();
		managerDirectory.addEmployee(manager1);
		managerDirectory.addEmployee(manager2);
		
		EmployeeDirectory companyDirectory=new EmployeeDirectory();
		companyDirectory.addEmployee(devDirectory);
		companyDirectory.addEmployee(managerDirectory);
		
		dev1.showEmployeeDetails();
		manager2.showEmployeeDetails();
		companyDirectory.showEmployeeDetails();
	}
}
