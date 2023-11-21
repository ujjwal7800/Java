package com.aurionpro.model;

import java.util.Date;

public class Employee 
{
	private int id;
	private String name;
	private String designation;
	private int managerId;
	private Date dateOfJoining;
	private double salary;
	private double commission;
	private int departmentId;
	public Employee(int id, String name, String designation, int managerId, Date date, double salary,
			double commission, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentId = departmentId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", managerId=" + managerId
				+ ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + ", commission=" + commission
				+ ", departmentId=" + departmentId + "]";
	}
	public static void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void remove(Employee employeeToRemove) {
		// TODO Auto-generated method stub
		
	}
	
}