package com.aurionpro.model;

public class EmailNotifier implements INotifier {

	@Override
	public void sendNotification(Account account, double amount, String str) {
		System.out.println("Email Notification Account no  " + account.getAccountNumber());
		System.out.println(amount + " amount " + str + " Successfully ");
		System.out.println("current balance is " + account.getBalance());

	}

}