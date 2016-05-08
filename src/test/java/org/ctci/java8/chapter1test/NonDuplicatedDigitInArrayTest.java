package org.ctci.java8.chapter1test;

import static org.junit.Assert.assertEquals;

import org.ctci.java8.chapter1.NonDuplicatedDigitInArray;
import org.junit.Test;

public class NonDuplicatedDigitInArrayTest {

	NonDuplicatedDigitInArray obj = new NonDuplicatedDigitInArray();

	@Test
	public void test() {
		// array elements duplicated only once.
		assertEquals(6, this.obj.getNonDuplicationDigitInArray(new int[] { 2, 2, 4, 5, 6, 5, 4 }));
		assertEquals(3, this.obj.getNonDuplicationDigitInArray(new int[] { 1, 1, 2, 2, 3, 4, 4 }));
	}
}
