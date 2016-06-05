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
			} else {
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

	public int[] mergeSortedArraysWithBuffer(final int[] array1WithBuffer, final int array[]) {
		int lastIndex = array1WithBuffer.length - 1;
		int aIndex = array1WithBuffer.length - array.length - 1;
		int bIndex = array.length - 1;

		while ((aIndex >= 0) && (bIndex >= 0)) {
			if (array1WithBuffer[aIndex] > array[bIndex]) {
				array1WithBuffer[lastIndex] = array1WithBuffer[aIndex];
				aIndex--;
				lastIndex--;
			} else {
				array1WithBuffer[lastIndex] = array[bIndex];
				bIndex--;
				lastIndex--;
			}
		}

		if (aIndex >= 0) {
			for (int i = aIndex; i >= 0; --i) {
				array1WithBuffer[lastIndex] = array1WithBuffer[i];
				lastIndex--;
			}
		} else if (bIndex >= 0) {
			for (int i = bIndex; i >= 0; --i) {
				array1WithBuffer[lastIndex] = array[i];
				lastIndex--;
			}
		}

		return array1WithBuffer;
	}
}
