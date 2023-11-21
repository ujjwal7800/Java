package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GameTest {

	 public static void main(String[] args) {
	  Game game=new Game(new Player("Dhruv"),new Player("Susminder"));
	  System.out.println("GAME BEGIN : ");
	  
	  while (game.getAnalyzer().analyzeResult() == ResultType.PROGRESS) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Current Board:");
	   game.getBoard().displayBoard();
	   System.out.print("Enter location : ");
	   int loc=sc.nextInt();
	   
	   try {
	    if(loc<0 || loc>8) {
	     throw new InvalidCellLocationException("Invalid cell location");
	    }
	    game.play(loc);
	   } catch (CellAlreadyMarkedException e) {
	    // TODO Auto-generated catch block
	    System.out.println(e.getMessage());
	   }catch (InvalidCellLocationException e) {
	    // TODO Auto-generated catch block
	    System.out.println(e.getMessage());
	   }
	   
	 }

	 }
	

//	@Test
//	@Disabled
//	void test() {
//		fail("Not yet implemented");
//	}

}
