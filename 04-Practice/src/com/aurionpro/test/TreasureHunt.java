package com.aurionpro.test;

import java.util.Scanner;
public class TreasureHunt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String direction=sc.next();
		if(direction.equalsIgnoreCase("LEFT"))
		{
			System.out.println("swim or wait? : ");
			String SwimWait=sc.next();
			if(SwimWait.equalsIgnoreCase("Wait"))
			{
				System.out.println("choose door : ");
				String door=sc.next();
				if(door.equalsIgnoreCase("Red"))
				{
					System.out.println("Game Over : Burned by fire");
				}
				else if(door.equalsIgnoreCase("Yellow"))
				{
					System.out.println("Win");
				}
				else if(door.equalsIgnoreCase("Blue"))
				{
					System.out.println("Game Over : Eaten by beasts");
				}
				else
				{
					System.out.println("Game Over");
				}
			}
			else if(SwimWait.equalsIgnoreCase("Swim"))
			{
				System.out.println("Game Over : Attacked by trout");
			}
			else
			{
			   	System.out.println("INVALID INPUT");
			}
		}
		else if(direction.equalsIgnoreCase("RIGHT"))
		{
			System.out.println("Game Over : Fall into a hole");
		}
		else
		{
		    System.out.println("INVALID INPUT");
		}
	}
}
