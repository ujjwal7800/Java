package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ResultAnalyzerTest {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	 @Test 
	    public void testHorizontalWin1() { 
	        try { 
	            // Create a board with a horizontal win configuration 
	            Board board = new Board(); 
	            board.setCellMark(0, MarkType.X); 
	            board.setCellMark(1, MarkType.X); 
	            board.setCellMark(2, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 @Test 
	    public void testHorizontalWin2() { 
	        try { 
	            // Create a board with a horizontal win configuration 
	            Board board = new Board(); 
	            board.setCellMark(3, MarkType.X); 
	            board.setCellMark(4, MarkType.X); 
	            board.setCellMark(5, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 @Test 
	    public void testHorizontalWin3() { 
	        try { 
	            // Create a board with a horizontal win configuration 
	            Board board = new Board(); 
	            board.setCellMark(6, MarkType.X); 
	            board.setCellMark(7, MarkType.X); 
	            board.setCellMark(8, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 
	 @Test 
	    public void testVerticalWin1() { 
	        try { 
	            // Create a board with a vertical win configuration 
	            Board board = new Board(); 
	            board.setCellMark(0, MarkType.X); 
	            board.setCellMark(3, MarkType.X); 
	            board.setCellMark(6, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 @Test 
	    public void testVerticalWin2() { 
	        try { 
	            // Create a board with a vertical win configuration 
	            Board board = new Board(); 
	            board.setCellMark(1, MarkType.X); 
	            board.setCellMark(4, MarkType.X); 
	            board.setCellMark(7, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 @Test 
	    public void testVerticalWin3() { 
	        try { 
	            // Create a board with a vertical win configuration 
	            Board board = new Board(); 
	            board.setCellMark(2, MarkType.X); 
	            board.setCellMark(5, MarkType.X); 
	            board.setCellMark(8, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	  @Test 
	    public void testDiagonalWin1() { 
	        try { 
	            // Create a board with a diagonal win configuration 
	            Board board = new Board(); 
	            board.setCellMark(0, MarkType.X); 
	            board.setCellMark(4, MarkType.X); 
	            board.setCellMark(8, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	  @Test 
	    public void testDiagonalWin2() { 
	        try { 
	            // Create a board with a diagonal win configuration 
	            Board board = new Board(); 
	            board.setCellMark(2, MarkType.X); 
	            board.setCellMark(4, MarkType.X); 
	            board.setCellMark(6, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.WIN, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	  @Test 
	    public void testDraw() { 
	        try { 
	            // Create a board with a draw configuration 
	            Board board = new Board(); 
	            board.setCellMark(0, MarkType.X); 
	            board.setCellMark(1, MarkType.O); 
	            board.setCellMark(2, MarkType.X); 
	            board.setCellMark(3, MarkType.O); 
	            board.setCellMark(4, MarkType.X); 
	            board.setCellMark(5, MarkType.O); 
	            board.setCellMark(6, MarkType.O); 
	            board.setCellMark(7, MarkType.X); 
	            board.setCellMark(8, MarkType.O); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.DRAW, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	  @Test 
	    public void testInProgress() { 
	        try { 
	            // Create a board with an in-progress configuration 
	            Board board = new Board(); 
	            board.setCellMark(0, MarkType.X); 
	            board.setCellMark(1, MarkType.O); 
	            board.setCellMark(2, MarkType.X); 
	 
	            ResultAnalyzer resultAnalyzer = new ResultAnalyzer(board); 
	            assertEquals(ResultType.PROGRESS, resultAnalyzer.analyzeResult()); 
	        } catch (Exception e) { 
	            fail("Exception should not be thrown: " + e.getMessage()); 
	        } 
	    } 
	 

}
