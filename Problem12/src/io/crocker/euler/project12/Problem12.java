package io.crocker.euler.project12;

/**
 * Problem 12: Highly Divisible Triangular Number
 * 
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first
 * ten terms would be: 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 * 
 * Let us list the factors of the first seven triangle numbers: 1: 1 3: 1,3 6:
 * 1,2,3,6 10: 1,2,5,10 15: 1,3,5,15 21: 1,3,7,21 28: 1,2,4,7,14,28
 * 
 * We can see that 28 is the first triangle number to have over five divisors.
 * 
 * What is the value of the first triangle number to have over five hundred
 * divisors?
 * 
 * http://www.wikihow.com/Find-How-Many-Factors-Are-in-a-Number
 * 
 * @author joshu
 *
 */
public class Problem12 {

	public static void main(String[] args) {
		Problem12 problem12 = new Problem12();

		System.out.println("d = 28: " + problem12.GetNumberWithNDivisors(5));
		System.out.println("d = 500: " + problem12.GetNumberWithNDivisors(500));
	}

	public int GetNumberWithNDivisors(int d) {
		int number = 0;
		int increment = 1;
		int divisors = 0;

		while (divisors < d) {
			divisors = 0;
			number += increment;

			divisors = this.getNumberOfDivisors(number);

			increment++;
			
//			System.out.println(number + " " + divisors);
		}

		return number;
	}

	private int getNumberOfDivisors(int number) {
		int divisors = 1;
//		int orig = number;
		int count = 0;
		
		for (int i = 2; i <= number; i++) {
			count  = 0;
			
			while (number % i == 0) {
				number /= i;
				count++;
			}
			
			if (divisors != 0) {
				divisors *= count;
			}
		}
		
		return divisors;
	}

	private boolean isFactor(long factor, long number) {
		if (factor == 0)
			return false;

		boolean isFactor = number % factor == 0;

		return isFactor;
	}

}
