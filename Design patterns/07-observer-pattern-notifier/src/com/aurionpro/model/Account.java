package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	double accountNumber;
	String name;
	double balance;
	List<INotifier> noti = new ArrayList<INotifier>();

	public Account(double accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<INotifier> getNoti() {
		return noti;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("insufficient balance");
		} else
			balance -= amount;
		for (INotifier n : noti) {
			n.sendNotification(this, amount, "withdraw");
		}

	}

	public void Deposite(double amount) {
		if (amount < 0) {
			System.out.println("invalid amount");
		}
		balance = balance + amount;
		for (INotifier n : noti) {
			n.sendNotification(this, amount, "deposit");
		}
	}

	public void registerNotifier(INotifier notifier) {
		noti.add(notifier);

	}

}