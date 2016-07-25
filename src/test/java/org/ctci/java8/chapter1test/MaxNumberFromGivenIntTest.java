package org.ctci.java8.chapter1test;

import static org.junit.Assert.assertEquals;

import org.ctci.java8.chapter1.MaxNumberFromGivenInt;
import org.junit.Test;

public class MaxNumberFromGivenIntTest {

	MaxNumberFromGivenInt obj = new MaxNumberFromGivenInt();

	@Test
	public void test() {
		assertEquals(4321, this.obj.maximumNumberFromGivenInt(1324));
		assertEquals(-1235, this.obj.maximumNumberFromGivenInt(-1523));
		assertEquals(0, this.obj.maximumNumberFromGivenInt(0));
	}

}
