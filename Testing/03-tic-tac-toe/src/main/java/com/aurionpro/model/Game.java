package com.aurionpro.model;

import java.util.Scanner;

public class Game {
    private Player currentPlayer;
    private Player[] players;
    private ResultAnalyzer analyzer;
    private Board board;

    public Game(Player player1, Player player2) {
        this.players = new Player[]{player1, player2};
        this.currentPlayer = player1;
        this.board = new Board();
        this.analyzer = new ResultAnalyzer(board);
    }
    
    public void play(int loc) throws CellAlreadyMarkedException,InvalidCellLocationException{
     MarkType currentPlayerMark;
     if(currentPlayer==players[0]) {
      System.out.println(currentPlayer);
      currentPlayerMark=MarkType.X;
     }else {
      System.out.println(currentPlayer);
      currentPlayerMark=MarkType.O;
     }
     
     board.setCellMark(loc, currentPlayerMark);
     analyzer.analyzeResult();
  if (analyzer.getResult() == ResultType.WIN) {
   System.out.println(currentPlayer.getPlayerName()+" won!");
   board.displayBoard();
  } else if (analyzer.getResult() == ResultType.DRAW) {
   System.out.println("Draw");
   board.displayBoard();
  } else {
   System.out.println("Game in progress...");
   switchPlayer();
  }
    }

//    public void play() throws CellAlreadyMarkedException {
//     Scanner sc = new Scanner(System.in);
//
//  while (analyzer.analyzeResult() == ResultType.PROGRESS) {
//   System.out.println("Current Board:");
//   board.displayBoard();
//
//   int move;
//   MarkType currentPlayerMark;
//
//   if (currentPlayer==players[0]) {
//    currentPlayerMark = MarkType.X;
//    System.out.println(currentPlayer);
//   } else {
//    currentPlayerMark = MarkType.O;
//    System.out.println(currentPlayer);
//   }
//
//   System.out.print("Enter cell number (0-8) for "+currentPlayer +" with mark "+ currentPlayerMark + ": ");
//   move = sc.nextInt();
//
//   try {
//    board.setCellMark(move, currentPlayerMark);
//    switchPlayer();
//   } catch (CellAlreadyMarkedException e) {
//    System.out.println(e.getMessage());
//   }
//  }
//
//  System.out.println("Final Board:");
//  board.displayBoard();
//
//  analyzer.analyzeResult();
//  if (analyzer.getResult() == ResultType.WIN) {
//   System.out.println("X won!");
//  } else if (analyzer.getResult() == ResultType.LOSE) {
//   System.out.println("O won!");
//  } else if (analyzer.getResult() == ResultType.DRAW) {
//   System.out.println("Draw");
//  } else {
//   System.out.println("Game in progress...");
//  }
//    }
    
    public void switchPlayer() {
        if (currentPlayer == players[0]) {
            currentPlayer = players[1];
        } else {
            currentPlayer = players[0];
        }
    }


    public Player[] getPlayers() {
  return players;
 }

 public void setPlayers(Player[] players) {
  this.players = players;
 }

 public void setCurrentPlayer(Player currentPlayer) {
  this.currentPlayer = currentPlayer;
 }

 public void setAnalyzer(ResultAnalyzer analyzer) {
  this.analyzer = analyzer;
 }

 public void setBoard(Board board) {
  this.board = board;
 }

    public ResultAnalyzer getAnalyzer() {
        return analyzer;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
