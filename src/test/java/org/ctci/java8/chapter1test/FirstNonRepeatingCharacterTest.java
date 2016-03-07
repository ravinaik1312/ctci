package org.ctci.java8.chapter1test;

import static org.junit.Assert.assertEquals;

import org.ctci.java8.chapter1.FirstNonRepeatingCharacter;
import org.junit.Test;

public class FirstNonRepeatingCharacterTest {
	FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();

	@Test
	public void test() {
		assertEquals(Character.valueOf('e'), obj.getFirstNonRepeatingCharacter("aaebcddcbf"));
		assertEquals(null, obj.getFirstNonRepeatingCharacter("aabbccdd"));
	}
}
