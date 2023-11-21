package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer(Board board) {
		super();
		this.board = board;
		this.result = ResultType.PROGRESS;
	}

	public ResultType getResult() {
		return result;
	}

	public void horizontalWinCheck() {
		if (board.cell[0].getMark() != MarkType.EMPTY && board.cell[0].getMark() == board.cell[1].getMark()
				&& board.cell[1].getMark() == board.cell[2].getMark()) {
			if (board.cell[0].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[0].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
		if (board.cell[3].getMark() != MarkType.EMPTY && board.cell[3].getMark() == board.cell[4].getMark()
				&& board.cell[4].getMark() == board.cell[5].getMark()) {
			if (board.cell[3].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[3].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
		if (board.cell[6].getMark() != MarkType.EMPTY && board.cell[6].getMark() == board.cell[7].getMark()
				&& board.cell[7].getMark() == board.cell[8].getMark()) {
			if (board.cell[6].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[6].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
	}

	public void verticalWinCheck() {
		if (board.cell[0].getMark() != MarkType.EMPTY && board.cell[0].getMark() == board.cell[3].getMark()
				&& board.cell[3].getMark() == board.cell[6].getMark()) {
			if (board.cell[0].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[0].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
		if (board.cell[1].getMark() != MarkType.EMPTY && board.cell[1].getMark() == board.cell[4].getMark()
				&& board.cell[4].getMark() == board.cell[7].getMark()) {
			if (board.cell[1].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[1].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
		if (board.cell[2].getMark() != MarkType.EMPTY && board.cell[2].getMark() == board.cell[5].getMark()
				&& board.cell[5].getMark() == board.cell[8].getMark()) {
			if (board.cell[2].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[2].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
	}

	public void diagonalWinCheck() {
		if (board.cell[0].getMark() != MarkType.EMPTY && board.cell[0].getMark() == board.cell[4].getMark()
				&& board.cell[4].getMark() == board.cell[8].getMark()) {
			if (board.cell[0].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[0].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
		if (board.cell[2].getMark() != MarkType.EMPTY && board.cell[2].getMark() == board.cell[4].getMark()
				&& board.cell[4].getMark() == board.cell[6].getMark()) {
			if (board.cell[2].getMark() == MarkType.X) {
				result = ResultType.WIN;
			}
			if (board.cell[2].getMark() == MarkType.O) {
				result = ResultType.WIN;
			}
		}
	}

	public ResultType analyzeResult() {
		horizontalWinCheck();
		verticalWinCheck();
		diagonalWinCheck();
		if (result == ResultType.PROGRESS) {
			if (board.isBoardFull()) {
				result = ResultType.DRAW;
			}
		}
		return result;
	}

}
