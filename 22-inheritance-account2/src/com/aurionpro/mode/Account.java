package com.aurionpro.mode;

public class Account 
{
	private static final double Amount = 0;
	protected int id;
	protected String name;
	protected double balance;
	public Account(int id, String name, double balance)
	{
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	

	


	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean withdraw(double amount)
	{
//		if (balance<0)
//		{
//			return false;
//			
//		}
		balance-= amount;

		return true;
	}
	
		public boolean deposit(double amount)
		{
			balance= balance + amount;
			return true;
			
		}
	


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
		
		
	
	
	
	
	
	

}
