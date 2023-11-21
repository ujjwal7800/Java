package com.aurionpro.model;

public class Manager extends Employee {
	protected double hra;
	protected double da;
	protected double ta;


	
	public Manager(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		hra = hra;
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
	
	


	@Override
	public double calculateAnnualCTC(double basic) {
		hra = 0.25 * basic;
		setHra(hra);
		da = (basic * 15)/100;
		setDa(da);
		
		ta = (basic * 10)/100;
		setTa(ta);
		System.out.println("MANAGER:"+ "\n"+"Hra: "+getHra() + " da: "+getDa() + " ta: "+getTa());
		return (basic + hra + da + ta);

	}

	

}