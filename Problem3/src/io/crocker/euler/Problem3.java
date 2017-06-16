package io.crocker.euler;

/**
 * Problem 3: Largest Prime Factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 * 
 * @author joshu
 *
 */
public class Problem3 {

	public static void main(String[] args) {
		Problem3 problem3 = new Problem3();

		System.out.println("x = 600851475143: " + String.valueOf(problem3.GetLargestPrimeFactor(600851475143l)));
		
	}
	
	public long GetLargestPrimeFactor(long x) {
		long largest = 0;
		
		// It likely won't be bigger than the square root
		for (long i = 1; i <= Math.sqrt(x); i++) {
			// A prime number is always odd (apart from 2)
			if (this.IsOdd(i) && this.IsFactor(i, x) && this.IsPrime(i) && i > largest) {
				largest = i;
			}
			
			System.out.println("Checked " + String.valueOf(i));
		}
		
		return largest;
	}

	private boolean IsPrime(long x) {
		boolean isPrime = true;
		
		for (long i = 2; i < x; i++) {
			if (x % i == 0) {
				isPrime = false;
			}
		}
		
		return isPrime;
	}
	
	private boolean IsFactor(long factor, long number) {
		if (factor == 0) return false;
		
		boolean isFactor = number % factor == 0;
		
		return isFactor;
	}
	
	private boolean IsOdd(long factor) {
		return factor % 2 == 1;
	}

}
