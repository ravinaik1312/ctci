package org.ctci.java8.chapter2;

import static org.junit.Assert.*;

import org.ctci.java8.chapter1.MaximizeStockArray;
import org.junit.Test;

public class MaximizeStockArrayTest {
	
	MaximizeStockArray obj = new MaximizeStockArray();

	@Test
	public void test() {
		assertEquals(6, obj.getMaxStockProfit(new int[]{10, 5, 8, 7, 9, 11}));
		assertEquals(0, obj.getMaxStockProfit(new int[]{10, 9, 8, 7, 6}));
		assertEquals(4, obj.getMaxStockProfit(new int[]{1, 2, 3, 4, 5}));
		assertEquals(8, obj.getMaxStockProfit(new int[]{5, 2, 7, 4, 3, 10}));
	}

}
