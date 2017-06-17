package io.crocker.euler.problem7;

/**
 * Problem 7: 10001st Prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 * 
 * @author joshu
 *
 */
public class Problem7 {

	public static void main(String[] args) {
		Problem7 problem7 = new Problem7();
		
		System.out.println("n = 10001: " + problem7.GetNthPrime(10001));
	}
	
	public long GetNthPrime(int n) {
		long prime = 0;
		long i = 0;
		
		while (n >= 0) {
			i++;
			
			if (this.isPrime(i)) {
				prime = i;
				n--;
			}
		}
		
		return prime;
	}

	private boolean isPrime(long i2) {
		for (long i = 2; i < i2; i++) {
			if (i2 % i == 0) {
				return false;
			}
		}

		return true;
	}

}
