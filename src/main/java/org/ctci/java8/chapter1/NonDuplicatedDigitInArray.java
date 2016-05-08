package org.ctci.java8.chapter1;

public class NonDuplicatedDigitInArray {

	/**
	 * this function finds the non duplication digit in an array. Checking the credibility of the XOR solution. If you XOR the result with
	 * one of the original numbers, you get the other original number.
	 *
	 * a ^ b = X
	 *
	 * X ^ a = b
	 *
	 * X ^ b = a
	 *
	 * This is used commonly in cryptography and hashing algorithms.
	 *
	 * This solution will only be valid if there is just one duplicate in the array.
	 *
	 * @param arr
	 * @return
	 */
	public int getNonDuplicationDigitInArray(final int arr[]) {
		int result = 0;
		for (final int element : arr) {
			result = result ^ element;
		}
		return result;
	}

}
