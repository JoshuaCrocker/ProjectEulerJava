package io.crocker.euler.problem22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem 22: Names Scores
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * @author joshua
 *
 */
public class Problem22 {

	private ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		Problem22 problem22 = new Problem22();

		problem22.ExtractNames();
		problem22.SortNames();
		int highest = problem22.ScoreNames();
		
		System.out.println(highest);
	}

	private int ScoreNames() {
		int highest = 0;
		int score = 1;

		for (int i = 0; i < this.names.size(); i++) {
			System.out.println(this.names.get(i));
			score = this.getNameScore(this.names.get(i));
			score *= (1 + i);
			
			if (score > highest) {
				highest = score;
			}
		}

		return score;
	}

	private int getNameScore(String name) {
		String[] chars = name.split("");
		int score = 0;

		for (String c : chars) {
			int code = Character.codePointAt(c, 0);
			score += code - 64;
		}

		return score;
	}

	private void SortNames() {
		Collections.sort(this.names);
	}

	private void ExtractNames() {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader("names.txt");
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				this.handleNames(sCurrentLine);
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

	private void handleNames(String sCurrentLine) {
		String[] names = sCurrentLine.split(",");

		for (String name : names) {
			this.names.add(name.replace("\"", ""));
		}
	}

}
