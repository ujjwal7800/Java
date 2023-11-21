package com.aurionpro.mode;

public class CurrentAccount extends Account
{
	public static final int OVER_DRAFT=25000;
	public boolean withdraw(double amount) 
	{
		if(this.getBalance()-amount>-OVER_DRAFT)
		{
			this.setBalance(this.getBalance()-amount);
			return true;
			
		}
		return false;
	}
	{
		double balance=this.getBalance();
	}

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	
	}
	

}
