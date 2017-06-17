package io.crocker.euler.problem6;

/**
 * Problem 6: Sum Square Difference
 * 
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... +
 * 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10)^2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author joshu
 *
 */
public class Problem6 {

	public static void main(String[] args) {
		Problem6 problem6 = new Problem6();

		System.out.println("x = 100: " + String.valueOf(problem6.FindDifference(100)));
	}

	public long FindDifference(int x) {
		long squareSum = this.getSumOfSquares(x);
		long sumSquare = this.getSquareOfSum(x);

		return sumSquare - squareSum;
	}

	private long getSquareOfSum(int x) {
		int sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += i;
		}

		return ((long) Math.pow(sum, 2));
	}

	private long getSumOfSquares(int x) {
		double sum = 0;

		for (int i = 1; i <= x; i++) {
			sum += Math.pow(i, 2);
		}

		return ((long) sum);
	}

}
