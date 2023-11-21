package com.aurionpro.model;

public class Developer extends Employee {

	private double PA;
	private double OT;

	public Developer(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
	}

	public double getPA() {
		return PA;
	}

	public void setPA(double pA) {
		PA = pA;
	}

	public double getOT() {
		return OT;
	}

	public void setOT(double oT) {
		OT = oT;
	}

	@Override
	public double calculateAnnualCTC(double basic) {
		PA = (basic * 40) / 100;
        setPA(PA);
		OT = (basic * 20) / 100;
		setOT(OT);
		System.out.println("DEVELOPER: "+"\n"+"PA: "+getPA()+" OT: "+getOT());

		return basic + PA + OT;
	}

}