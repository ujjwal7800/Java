package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayers;
import com.aurionpro.model.Player;

public class ClassifyPlayerTest {
	public static void main(String[] args) 
	{
		Player[] players=
				{
						new Player(1,"Ujjwal",2000,1, 6),
						new Player(2,"Rahul",200,4, 5),
						new Player(3,"Siddhi",198,5, 4),
						new Player(4,"Dhruv",200,8, 3)
				};
		ClassifyPlayers obj=new ClassifyPlayers();
		Player[]aListers=obj.getAListers(players);
		printPlayers(aListers);
		
		Player[]bListers=obj.getBListers(players);
		printPlayers(bListers);
		
//		for(Player p:aListers)
//		{
//			System.out.println(p);
//		}
	

	}

	private static void printPlayers(Player[] aListers) {
		for(Player p:aListers)
		{
			System.out.println(p);
		}
	
		
	}
	
}
