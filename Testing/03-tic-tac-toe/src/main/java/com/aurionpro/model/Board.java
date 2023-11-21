package com.aurionpro.model;

import java.util.function.BooleanSupplier;

public class Board {
	Cell[] cell = new Cell[9];

	public Board() {
		this.cell= new Cell[]{new Cell(),new Cell(),new Cell(),
		            new Cell(),new Cell(),new Cell(),
		            new Cell(),new Cell(),new Cell()};
	}
	
	public boolean isBoardFull(){
		for(Cell x :this.cell) {
			if(x.isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	public void setCellMark(int loc,MarkType mark) throws CellAlreadyMarkedException{
		this.cell[loc].setMark(mark);
	} 
	
	public Cell[] getCell() {
		return cell;
	}

	public void displayBoard() {
        Cell[] cells = getCell();
        for (int i = 0; i < 9; i++) {
            System.out.print(cells[i].getMark() + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

	
}
