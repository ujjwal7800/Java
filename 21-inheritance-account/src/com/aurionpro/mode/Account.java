package com.aurionpro.mode;

public class Account 
{
	private static final double Amount = 0;
	private int id;
	private String name;
	private double balance;
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
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


	public double getBalance() {
		return balance;
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
