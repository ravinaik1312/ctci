package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.StringPermutation;
import org.junit.Test;

public class StringPermutationTest {
	
	StringPermutation obj = new StringPermutation();

	@Test
	public void test() {
		assertEquals(true, obj.isStringPermutation("abcd", "dcba"));
		assertEquals(true, obj.isStringPermutationUsingSort("abcd", "dcba"));
		
		assertEquals(true, obj.isStringPermutation("veer", "ever"));
		assertEquals(false, obj.isStringPermutationUsingSort("veer", "vear"));
	}

}
