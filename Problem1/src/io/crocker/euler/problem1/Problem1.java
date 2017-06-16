package io.crocker.euler.problem1;

/**
 * Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author joshu
 *
 */
public class Problem1 {

	public static void main(String[] args) {
		Problem1 problem1 = new Problem1();
		
		System.out.println("x = 1000: " + String.valueOf(problem1.SumToX(1000)));
	}
	
	/**
	 * Calculates the sum of the multiples of 3 and 5 up to `x`.
	 * 
	 * @param x
	 * @return
	 */
	public int SumToX(int x) {
		int sum = 0;
		
		for (int i = 0; i < x; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
