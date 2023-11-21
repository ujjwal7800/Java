package com.aurionpro.model;

public class Employee 
{
	private int id;
	private String name;
	private double basic;
	private double hra;
	private double da;
	private double ta;
	public Employee(int id, String name, double basic ) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = 0.20*basic;
		this.da = 0.15*basic;
		this.ta = 0.10*basic;;
	}
//	public Employee(int i, String string, int j) {
//	}
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	
	public double calculateTotalSalary() {
        return basic + hra + da + ta;
    }
	
	public double calculateTax(double taxRate) {
        double totalSalary = calculateTotalSalary();
        if (totalSalary>=500000 && totalSalary<800000)
        	{
        	return 0.10*totalSalary;
        	}
        else if (totalSalary >=800000 && totalSalary<100000)
        {
        	return 0.20*totalSalary;
        }
        else if(totalSalary >=1000000)
        {
        	return 0.30*totalSalary;
        	
        }
		return 0;
		
		
	}
	public void printSalarySlip(double taxRate) {
        System.out.println("Salary Slip for Employee: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("Tax Amount: " + calculateTax(taxRate));
//        System.out.println("Net Salary: " + calculateNetSalary(taxRate));
    }

	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", hra=" + hra + ", da=" + da + ", ta="
				+ ta + "]";
	}
	

}
