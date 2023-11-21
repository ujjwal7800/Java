package com.aurionpro.model;

public class Account 
{
	private int id;
	private String name;
	private double balance;
	private AccountType accounttype;
	
	public Account(int id, String name, double balance, AccountType accounttype) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accounttype = accounttype;
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

	public AccountType getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(AccountType accounttype) {
		this.accounttype = accounttype;
	}
	
	public void deposit(double amount)
	{
		this.balance=+amount;
	}
	public boolean withdraw(double amount)
	{
		if(balance-amount>0)
		{
			this.balance=-amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accounttype=" + accounttype + "]";
	}
	

	
}	
