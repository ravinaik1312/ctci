package org.ctci.java8.chapter1;

public class MaxNumberFromGivenInt {

	/**
	 * Given an integer in the language specific integer range returns the maximum number that can be formed with the digits of the integer.
	 *
	 * Assuming the number formed is also in the integer range.
	 *
	 * @param n
	 * @return
	 */
	public int maximumNumberFromGivenInt(final int n) {
		int localNum = n;
		if (localNum == 0) {
			return 0;
		}
		boolean isNegative = false;
		if (localNum < 0) {
			isNegative = true;
			localNum = localNum * -1;
		}
		// Digits can only be between 0-9(10)
		// this array will store the number of
		// times the digits are present in the given number
		final int times[] = new int[10];
		while (localNum != 0) {
			final int val = localNum % 10;
			times[val]++;
			localNum = localNum / 10;
		}
		final StringBuilder finalNum = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
			for (int j = 0; j < times[i]; ++j) {
				finalNum.append(i);
			}
		}

		if (isNegative) {
			return -1 * Integer.parseInt(finalNum.reverse().toString());
		} else {
			return Integer.parseInt(finalNum.toString());
		}
	}
}
