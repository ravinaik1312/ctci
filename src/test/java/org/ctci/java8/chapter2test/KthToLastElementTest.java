package org.ctci.java8.chapter2test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.ctci.java8.chapter2.KthToLastElement;
import org.ctci.java8.chapter2.LinkedListNode;
import org.junit.Test;

public class KthToLastElementTest {
	
	KthToLastElement obj = new KthToLastElement();

	@Test
	public void test() {
		LinkedListNode first = new LinkedListNode(0, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 3; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		assertEquals(1, obj.getKthToLastElement(head, 2).data);
		
	}

}
