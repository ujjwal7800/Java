package com.aurionpro.model;

public class AccountType 
{
	private int id;
	private String name;
	private double balance;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getBalamce()
	{
		return balance;
	}
}
