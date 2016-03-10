package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.LongestCommonSubsequence;
import org.junit.Test;

public class LongestCommonSubsequenceTest {
	
	LongestCommonSubsequence obj = new LongestCommonSubsequence();

	@Test
	public void test() {
		assertEquals(6, obj.getLongestCommonSubsequence("abaceb","abdavceb"));
		assertEquals(0, obj.getLongestCommonSubsequence(null,"abdavceb"));
		assertEquals(0, obj.getLongestCommonSubsequence("abaceb",null));
		assertEquals(0, obj.getLongestCommonSubsequence(null,null));
		assertEquals(0, obj.getLongestCommonSubsequence("","abdavceb"));
		assertEquals(3, obj.getLongestCommonSubsequence("bracket","nack"));
	}

}
