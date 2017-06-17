package io.crocker.euler.problem10;

/**
 * Problem 10: Summation of Primes
 * 
 * The sum of primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author joshu
 *
 */
public class Problem10 {

	public static void main(String[] args) {
		Problem10 problem10 = new Problem10();

		System.out.println("x = 2000000: " + problem10.SumPrimesBelow(2000000));
	}

	public long SumPrimesBelow(int x) {
		long sum = 2;

		for (int i = 3; i < x; i++) {
			System.out.println(i);
			
			if (this.isOdd(i) && this.isPrime(i)) {
				sum += i;
			}
		}

		return sum;
	}

	private boolean isPrime(int x) {
		for (long i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	private boolean isOdd(long factor) {
		return factor % 2 == 1;
	}
}
