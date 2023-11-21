package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void sendNotification(Account account, double amount, String string) {
		System.out.println("SMS Notification Account no  " + account.getAccountNumber());
		System.out.println(amount + " amount " + string + " Successfully " );
		System.out.println("current balance is "+ account.getBalance());
		
	}

}