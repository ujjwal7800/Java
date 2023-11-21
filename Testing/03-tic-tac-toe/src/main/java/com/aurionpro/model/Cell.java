package com.aurionpro.model;

public class Cell {
	private MarkType mark;

	public Cell() {
		this.mark = MarkType.EMPTY;
	}
	
	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark)throws CellAlreadyMarkedException{
		if(!this.isEmpty()) {
			throw new CellAlreadyMarkedException("Cell already marked");
		}
		this.mark=mark;
	}

	public boolean isEmpty() {
		return this.mark==MarkType.EMPTY;
	}
	
	
}
