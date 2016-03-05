package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.StringRotation;
import org.junit.Test;

public class StringRotationTest {
	
	StringRotation obj = new StringRotation();

	@Test
	public void test() {
		assertEquals(true, obj.isStringRotation("taper", "ertap"));
		assertEquals(false, obj.isStringRotation("abcdef", "abcdefg"));
	}

}
