package com.aurionpro.model;

import java.util.stream.Stream;

public class Account {
	private int accID;
	private String accName;
	private Gender accGender;
	private int balance;

	public Account(int accID, String accName, Gender accGender, int balance) {
		super();
		this.accID = accID;
		this.accName = accName;
		this.accGender = accGender;
		this.balance = balance;
	}

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Gender getAccGender() {
		return accGender;
	}

	public void setAccGender(Gender accGender) {
		this.accGender = accGender;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accID=" + accID + ", accName=" + accName + ", accGender=" + accGender + ", balance=" + balance
				+ "]";
	}

	public static Stream<Account> stream() {
		// TODO Auto-generated method stub
		return null;
	}
}
