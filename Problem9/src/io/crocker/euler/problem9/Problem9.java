package io.crocker.euler.problem9;

public class Problem9 {

	/**
	 * Problem 9: Special Pythagorean Triplet
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which, a^2 + b^2 = c^2
	 * 
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problem9 problem9 = new Problem9();
		
		int sum = 1000;
		
		int answer = problem9.FindSpecialPythagoreanTriplet(sum);
		
		
		
		if (answer == -1) {
			System.out.println("No answer was found with the sum " + String.valueOf(sum));
		} else {
			System.out.println("Answer found with sum " + String.valueOf(sum) + ": " + String.valueOf(answer));
		}
	}

	public int FindSpecialPythagoreanTriplet(int sum) {
		for (int a = 0; a < 1000; a++) {
			for (int b = 0; b < 1000; b++) {
				for (int c = 0; c < 1000; c++) {
					if (a < b && b < c && (a + b + c) == sum && this.IsPythagoreanTriplet(a, b, c)) {
						return a * b * c;
					}
				}
			}
		}
		
		return -1;
	}
	
	private boolean IsPythagoreanTriplet(int a, int b, int c) {
		double aSquared = Math.pow(a, 2);
		double bSquared = Math.pow(b, 2);
		double cSquared = Math.pow(c, 2);
		
		return (aSquared + bSquared) == cSquared;
	}

}
