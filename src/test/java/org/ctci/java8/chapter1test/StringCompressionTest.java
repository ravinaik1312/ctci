package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.StringCompression;
import org.junit.Test;

public class StringCompressionTest {
	
	StringCompression obj = new StringCompression();

	@Test
	public void test() {
		assertEquals("a2b3c1", obj.compressString("aabbbc"));
		assertEquals("ababa", "ababa");
		assertEquals("a4b3c1d2", obj.compressString("aaaabbbcdd"));
	}

}
