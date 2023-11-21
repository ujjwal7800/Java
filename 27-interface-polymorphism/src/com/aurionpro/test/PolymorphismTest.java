package com.aurionpro.test;
import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.Imannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest 
{
	public static void main(String[] args) 
	{
		Man man=new Man();
		Boy boy=new Boy();
		
		//atTheparty(man);
		atTheParty(boy);
		
		atTheMovies(man);
		atTheMovies(boy);
		
		
	}

	private static void atTheMovies(Imannerable obj) {
		// TODO Auto-generated method stub
		System.out.println("at the party hall");
		obj.wish();
		obj.depart();
		
		
	}

	private static void atTheParty(IEmotionable obj) {
		// TODO Auto-generated method stub
		System.out.println("at the movies hall");
		obj.cry();
		obj.laugh();
		
	}
	

}
