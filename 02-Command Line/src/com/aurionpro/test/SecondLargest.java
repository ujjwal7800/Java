package com.aurionpro.test;

public class SecondLargest
{

	public static void main(String[] args)
	{
		int number[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			number[i]=Integer.parseInt(args[i]);
		}	
	//	for(int x:numebrs)
	//	{
	//		System.out.println(x);
	//	}
		
			int largest=number[0];
			int secondLargest=Integer.MIN_VALUE;
			for(int i=0;i<args.length;i++)
			{
				if (largest<number[0])
				{
					secondLargest=largest;
					largest=number[i];
				}
				else {
					if(secondLargest<number[i])
					{
						secondLargest=number[i];
						
					}
				}
				
			}
		
		System.out.println("secondLargest numbers="+secondLargest);
	}

}
