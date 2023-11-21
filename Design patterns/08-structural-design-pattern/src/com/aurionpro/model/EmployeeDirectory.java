package com.aurionpro.model;

import java.util.List;
import java.util.ArrayList;

public class EmployeeDirectory implements IEmployee {
	private List<IEmployee> employeesList;

	public EmployeeDirectory() {
		super();
		this.employeesList = new ArrayList<IEmployee>();
	}
	
	public void addEmployee(IEmployee employee) {
		employeesList.add(employee);
	}
	public void removeEmployee(IEmployee employee) {
		if(!employeesList.contains(employee)) {
			System.out.println("Employee not there in the list");
		}
		else {
			employeesList.remove(employee);
			System.out.println("Employee removed");
		}
		
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(employeesList);
	}

	@Override
	public String toString() {
		return "EmployeeDirectory [employeesList=" + employeesList + "]";
	}

	
}
