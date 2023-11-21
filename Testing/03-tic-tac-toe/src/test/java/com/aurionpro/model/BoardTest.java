package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAllCellsAreEmptyWhenBoardIsCreated() {
		Board board = new Board();
		Cell[] cells = board.getCell();
		for (int i = 0; i < cells.length; i++) {
			assertTrue(cells[i].isEmpty());
		}
	}

	@Test
	public void testMarkCellAtValidLocation() throws CellAlreadyMarkedException {
		Board board = new Board();
		board.setCellMark(7, MarkType.X);
		assertEquals(MarkType.X, board.getCell()[7].getMark());
	}

	@Test
	public void testMarkCellAtInvalidLocation() {
		Board board = new Board();

		assertThrows(IllegalArgumentException.class, () -> board.setCellMark(9, MarkType.X));

	}
	  
	 @Test 
	    public void testBoardIsFull() throws CellAlreadyMarkedException { 
	        Board board = new Board(); 
	        // Mark all cells on the board 
	        for (int i = 0; i < 9; i++) {  
	            if (i % 2 == 0) {  
	                board.setCellMark(i, MarkType.X);  
	            } else {  
	                board.setCellMark(i, MarkType.O);  
	            }  
	        } 
	        assertTrue(board.isBoardFull()); 
	    } 
	 @Test 
	    public void testMarkCellTwice() { 
	        Board board = new Board(); 
	        assertDoesNotThrow(() -> { 
	            board.setCellMark(3, MarkType.X); 
	            assertThrows(CellAlreadyMarkedException.class, () -> board.setCellMark(3, MarkType.O)); 
	        }); 
	    } 

}
