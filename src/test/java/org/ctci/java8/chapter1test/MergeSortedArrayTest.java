package org.ctci.java8.chapter1test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.ctci.java8.chapter1.MergeSortedArrays;
import org.junit.Test;

public class MergeSortedArrayTest {

	MergeSortedArrays obj = new MergeSortedArrays();

	@Test
	public void test() {
		final int returnedArray1[] = this.obj.mergeSortedArrays(new int[] { 1, 4, 7 }, new int[] { 2, 3, 5, 6 });
		final int returnedArray2[] = this.obj.mergeSortedArrays(new int[] { 23, 24 }, new int[] { 17, 46 });
		final int returnedArray3[] = this.obj.mergeSortedArrays(new int[0], new int[] { 1, 2, 3 });
		assertTrue(Arrays.equals(returnedArray1, new int[] { 1, 2, 3, 4, 5, 6, 7 }));
		assertTrue(Arrays.equals(returnedArray2, new int[] { 17, 23, 24, 46 }));
		assertTrue(Arrays.equals(returnedArray3, new int[] { 1, 2, 3 }));
	}
}
