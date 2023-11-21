package com.aurionpro.test;
import com.aurionpro.mode.Account;
import com.aurionpro.mode.SavingAccount;

public class AccountTest
{
	public static void main(String[] args)
	{
		SavingAccount saving=new SavingAccount(1,"jay",3000);
		System.out.println(saving);
		printDepositMessage(saving.deposit(1000));
		System.out.println(saving);
		printDepositMessage(saving.withdraw(500));
		System.out.println(saving);
		
	}

	private static void printDepositMessage(boolean transaction) {
		if(transaction)
		{
			System.out.println("successful..");
		}
		else
		{
			System.out.println("unsuccessful.");
		}
		
	}

}
