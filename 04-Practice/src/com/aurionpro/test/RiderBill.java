package com.aurionpro.test;
import java.util.Scanner;

public class RiderBill 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
        System.out.print("Enter the height in cm: ");
        int height = sc.nextInt();
        int total=0;
        if(height>120)
        {
            System.out.println("Can ride");
            System.out.print("Enter your age : ");
            int age=sc.nextInt();

            if(age>0 && age<12)
            {
                total=5;
            }
            else if(age>=12 && age<18)
            {
                total=7;
            }
            else if(age>=18 && age<45)
            {
                total=12;
            }
            else if(age>=45 && age<=55)
            {
                total=0;
            }
            else
            {
                System.out.println("Can't Ride");
            }
            System.out.print("want photos? : ");
            String photo=sc.next();
            if(photo.equalsIgnoreCase("yes"))
            {
                total=total+3;
                System.out.println("The total bill is : $"+total);
            }
            else if(photo.equalsIgnoreCase("no"))
            {
                System.out.println("The total bill is : $"+total);
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
        else
        {
            System.out.println("Can't ride");
        }
    }
}


