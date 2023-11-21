package com.aurionpro.mode;

public class CurrentAccount extends Account
{
	public static final int OVER_DRAFT=25000;
	public boolean withdraw(double amount) 
	{
		if(balance-amount>-OVER_DRAFT)
		{
			Balance(Balance()-amount);
			return true;
			
		}
		return false;
	}
	private void Balance() {
		// TODO Auto-generated method stub
		
	}
	{
		double balance=this.getBalance();
	}

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	
	}

	private double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
