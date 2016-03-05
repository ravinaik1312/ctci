package org.ctci.java8.chapter1test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.ctci.java8.chapter1.MaxElementInList;
import org.junit.Test;

public class MaxElementInListTest {
	
	MaxElementInList obj = new MaxElementInList();

	@Test
	public void test() {
		List<Integer> inputList = new ArrayList<Integer>();
		inputList.add(1);
		inputList.add(10);
		inputList.add(100);
		inputList.add(17);
		inputList.add(51);
		assertEquals(100, obj.getMaxElementInList(inputList));
		inputList.add(65533);
		assertEquals(65533, obj.getMaxElementInList(inputList));
	}

}
