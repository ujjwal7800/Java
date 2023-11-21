package com.aurionpro.model;

public class Accountant extends Employee {

	private double hra;
	private double ma;

	public Accountant(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMa() {
		return ma;
	}

	public void setMa(double ma) {
		this.ma = ma;
	}

	@Override
	public double calculateAnnualCTC(double basic) {
		hra = 0.25 * basic;
		setHra(hra);
		ma = 0.2 * basic;
		setMa(ma);
		System.out.println("ACCOUNTANT:"+"\n"+"hra: "+getHra()+" ma: "+getMa());
		return basic + hra + ma;
	}

}