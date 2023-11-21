package com.aurionpro.mode;

public class SavingAccount extends Account {
	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	public static final int MIN_BALANCE = 1000;

	public boolean withdarw(double amount) {
		double balance = this.getBalance();
		if (balance - amount > MIN_BALANCE) {
			this.setBalance(this.getBalance()- amount);
			return true;
		}
		return false;
	}

	private double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
