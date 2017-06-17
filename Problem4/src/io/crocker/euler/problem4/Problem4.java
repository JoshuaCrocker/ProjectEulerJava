package io.crocker.euler.problem4;

public class Problem4 {
	
	/**
	 * Problem 4: Largest Palindrome Product
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
	 * numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Problem4 problem4 = new Problem4();
		
		System.out.println("digits = 3: " + String.valueOf(problem4.LargestPalindromicNumber(3)));
	}
	
	public int LargestPalindromicNumber(int digits) {
		int min = (int) (1 * (Math.pow(10, digits - 1)));
		int max = (int) (1 * (Math.pow(10, digits)));
		
		int largest = 0;
		
		for (int x = min; x < max; x++) {
			for (int y = min; y < max; y++) {
				int sum = x * y;
				
				if (this.IsPalindromic(sum) && sum > largest) {
					largest = sum;
				}
			}
		}
		
		return largest;
	}
	
	private boolean IsPalindromic(int number) {
		String numberStr = String.valueOf(number);
		String reverse = new StringBuilder(numberStr).reverse().toString();
		
		return numberStr.equals(reverse);
	}

}
