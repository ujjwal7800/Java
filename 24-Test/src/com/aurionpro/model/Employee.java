package com.aurionpro.model;

public abstract class Employee {
	protected long employeeId;
	protected String name;
	protected double basic;
	

	public Employee(long employeeId, String name, double basic) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basic = basic;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public abstract double calculateAnnualCTC(double basic);

}