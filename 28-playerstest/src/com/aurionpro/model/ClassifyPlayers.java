package com.aurionpro.model;

public class ClassifyPlayers {
	private Player[] Players;

	public Player[] getAListers(Player[] player) {
		int count = 0;
		
		for (Player p : player) 
		{
			if (p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150)) 
			{
				count++;

			}

		}
		Player[] aListers=new Player[count];
		
		for(int i=0,j=0; i<Players.length;i++)
		{
			if(Players[i].getMatches()>100&&(Players[i].getRuns()>5000 || Players[i].getWickets))
			{
				aListers[j++]=Players[i];
			}
		}
		return aListers;
}

	public Player[] getBListers(Player[] players2) {
		return null;
	}
}
