package com.aurionpro.test;
import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest
{
	public static void main(String[]args)
	{
		Account savingAccount=new  Account(181,"Ashish",5000,AccountType.SAVING);
		System.out.println(savingAccount);
		savingAccount.deposit(10000);
		System.out.println(savingAccount);
		
		withdrawAmount(savingAccount,2000);
		System.out.println(savingAccount);
	}
	private static void withdrawAmount(Account savingAccount,double amount)
	{
		
		if(savingAccount.withdraw(20000))
		{
			System.out.println("Withdrwal is successful");
			
		}
		else {
			System.out.println("Insufficient Anount");
		}
	}

}

