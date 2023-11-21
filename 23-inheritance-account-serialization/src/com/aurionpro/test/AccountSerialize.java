package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Account;

public class AccountSerialize 
{
	public static void main(String[] args) 
	{
		Account account=new Account(1,"Ujjwal",10000);
		try
		{
			FileOutputStream file=new FileOutputStream("D:\\Serialization");
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(account);
			out.close(); 
			file.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
		
		
			
			
		
	}

}
