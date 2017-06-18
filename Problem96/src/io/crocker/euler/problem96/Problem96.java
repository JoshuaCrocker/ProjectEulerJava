package io.crocker.euler.problem96;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Problem 96: Su Doku
 * 
 * Su Doku (Japanese meaning number place) is the name given to a popular puzzle
 * concept. Its origin is unclear, but credit must be attributed to Leonhard
 * Euler who invented a similar, and much more difficult, puzzle idea called
 * Latin Squares. The objective of Su Doku puzzles, however, is to replace the
 * blanks (or zeros) in a 9 by 9 grid in such that each row, column, and 3 by 3
 * box contains each of the digits 1 to 9.
 * 
 * A well constructed Su Doku puzzle has a unique solution and can be solved by
 * logic, although it may be necessary to employ "guess and test" methods in
 * order to eliminate options (there is much contested opinion over this). The
 * complexity of the search determines the difficulty of the puzzle; the example
 * above is considered easy because it can be solved by straight forward direct
 * deduction.
 * 
 * The 6K text file, sudoku.txt (right click and 'Save Link/Target As...'),
 * contains fifty different Su Doku puzzles ranging in difficulty, but all with
 * unique solutions (the first puzzle in the file is the example above).
 * 
 * By solving all fifty puzzles find the sum of the 3-digit numbers found in the
 * top left corner of each solution grid; for example, 483 is the 3-digit number
 * found in the top left corner of the solution grid above.
 * 
 * @author joshua
 *
 */
public class Problem96 {

	private ArrayList<Sudoku> puzzles = new ArrayList<Sudoku>();

	public static void main(String[] args) {
		Problem96 problem96 = new Problem96();

		problem96.ExtractPuzzles();
		problem96.PrintPuzzles();
	}

	public void ExtractPuzzles() {
		BufferedReader br = null;
		FileReader fr = null;
		Sudoku puzzle = new Sudoku();

		try {
			fr = new FileReader("sudoku.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				if (puzzle.isFull()) {
					this.puzzles.add(puzzle);
					puzzle = new Sudoku();
				}

				if (sCurrentLine.length() == 9) {
					puzzle.addRow(sCurrentLine);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}
	
	public void PrintPuzzles() {
		for (Sudoku puzzle : this.puzzles) {
			puzzle.printPuzzle();
			System.out.println("");
		}
	}

}
