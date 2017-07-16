package io.crocker.euler.problem96;

public class Sudoku {
	private int[][] grid = new int[9][9];
	private boolean[][] editable = new boolean[9][9];
	private int currentRow = 0;
	private int currentCol = 0;

	public void addRow(String sCurrentLine) {
		this.currentCol = 0;
		String[] numbers = sCurrentLine.split("");

		for (String number : numbers) {
			this.grid[this.currentRow][this.currentCol] = Integer.parseInt(number);
			this.editable[this.currentRow][this.currentCol] = Integer.parseInt(number) == 0;
			this.currentCol++;
		}

		currentRow++;
	}

	public boolean isFull() {
		return this.currentRow >= 9;
	}

	public void printPuzzle() {
		for (int y = 0; y < this.grid.length; y++) {
			for (int x = 0; x < this.grid[y].length; x++) {
				System.out.print(this.grid[y][x]);
			}
			System.out.println("");
		}
	}

	public void solve() {
		// Fill each square with the remaining numbers
		// Check each row and column
		// Shift invalid numbers
		// Loop.
	}

}
