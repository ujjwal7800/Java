package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.util.AgeUtil;
import com.aurionpro.exception.InvalidAgeException;

public class VlidateAgeTest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter use age");
		int age=sc.nextInt();
		try
		{
			AgeUtil.validateAge(age);
			
		}
		catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
