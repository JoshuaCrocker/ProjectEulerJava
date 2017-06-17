package io.crocker.euler.problem5;

public class Problem5 {

	/**
	 * Problem 5: Smallest Multiple
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * 
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problem5 problem5 = new Problem5();
		
		System.out.println("x = 20: " + String.valueOf(problem5.SmallestMultiple(20)));
	}
	
	public int SmallestMultiple(int x) {
		boolean found = false;
		boolean valid = true;
		int i = 10;
		
		while (!found) {
			valid = true;
			i++;
			
			for (int y = 1; y <= x; y++) {
				
				if (i % y != 0) {
					valid = false;
				}
			}
			
			if (valid) {
				return i;
			}
		}
		
		return -1;
	}

}
