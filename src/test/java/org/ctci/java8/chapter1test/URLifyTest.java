package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.URLify;
import org.junit.Test;

public class URLifyTest {
	
	URLify obj = new URLify();

	@Test
	public void test() {
		assertEquals("a%20b%20c", obj.urlifyString("a b c"));
		assertEquals("abc", obj.urlifyString("abc"));
	}
}
