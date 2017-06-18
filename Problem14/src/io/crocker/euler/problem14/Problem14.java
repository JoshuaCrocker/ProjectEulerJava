package io.crocker.euler.problem14;

/**
 * Problem 14: Longest Collatz Sequence
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n → n/2 (n is even)
 * 
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * It can be seen that this sequence (starting at 13 and finishing at 1)
 * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
 * is thought that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author joshua
 *
 */
public class Problem14 {

	public static void main(String[] args) {
		Problem14 problem14 = new Problem14();

		int max = 0;
		int num = 0;
		int count = 0;

		for (int n = 13; n < 1000000; n++) {
			count = problem14.GetCollatzTermsCount(n);
			System.out.println("n = " + n + ": " + String.valueOf(count));

			if (count > max) {
				max = count;
				num = n;
			}
		}

		System.out.println("");
		System.out.println(num + " -> " + max);
	}

	public int GetCollatzTermsCount(long n) {
		int count = 0;

		while (n != 1) {
			count++;

			if (this.isEven(n)) {
				n = this.collatzEven(n);
			} else {
				n = this.collatzOdd(n);
			}
		}

		return count + 1;
	}

	private long collatzOdd(long n) {
		return (3 * n) + 1;
	}

	private long collatzEven(long n) {
		return n / 2;
	}

	private boolean isEven(long n) {
		return n % 2 == 0;
	}

}
