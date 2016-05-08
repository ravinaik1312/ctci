package org.ctci.java8.chapter1;

public class MergeSortedArrays {

	public int[] mergeSortedArrays(final int[] array1, final int[] array2) {
		final int size1 = array1.length;
		final int size2 = array2.length;
		final int resultArray[] = new int[size1 + size2];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < size1 && j < size2) {
			if (array1[i] <= array2[j]) {
				resultArray[k] = array1[i];
				i++;
			}
			else {
				resultArray[k] = array2[j];
				j++;
			}
			k++;
		}
		if (i < size1) {
			System.arraycopy(array1, i, resultArray, k, size1 - i);
		}
		if (j < size2) {
			System.arraycopy(array2, j, resultArray, k, size2 - j);
		}

		return resultArray;

	}
}
