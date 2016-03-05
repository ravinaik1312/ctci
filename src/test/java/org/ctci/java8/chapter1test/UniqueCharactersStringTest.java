package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.UniqueCharactersString;
import org.junit.Test;

public class UniqueCharactersStringTest {
	
	UniqueCharactersString obj = new UniqueCharactersString();

	@Test
	public void testSimpleInput() {
		assertEquals(true, obj.areAllCharactersUnique("abcdefg"));
		assertEquals(false, obj.areAllCharactersUnique("madam"));
		assertEquals(true, obj.areAllCharactersUnique("xyz1234^&("));
		assertEquals(false, obj.areAllCharactersUnique("$%$%$%()()(()"));
	}

}
