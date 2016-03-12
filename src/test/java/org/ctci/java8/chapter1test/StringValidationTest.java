package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.StringValidation;
import org.junit.Test;

public class StringValidationTest {
	StringValidation obj = new StringValidation();

	@Test
	public void test() {
		assertEquals(true, obj.isStringValid("123(45*4)"));
		assertEquals(false, obj.isStringValid("(()"));
		assertEquals(true, obj.isStringValid(null));
		assertEquals(true, obj.isStringValid(""));
		assertEquals(true, obj.isStringValid("((((788)898))yytttt)"));
	}

}
