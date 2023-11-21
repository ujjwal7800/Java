package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.SmsNotifier;

public class AccountTest 
{
	public static void main(String[] args) {
		Account account =new Account(101, "Ujjwal", 3000000);
		account.registerNotifier(new SmsNotifier());
		account.withdraw(100000);
		account.Deposite(2000);
	}

}
