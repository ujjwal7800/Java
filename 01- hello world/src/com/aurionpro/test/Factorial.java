package com.aurionpro.test;
import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("print the factorial number");
		 int n, fac=1;
		 n=sc.nextInt();
		 while (n>0)
		 {
			 fac=fac*n;
			 n=n-1;
		 }
		 System.out.println("factorial="+fac);
		 
		
	}
}

   


