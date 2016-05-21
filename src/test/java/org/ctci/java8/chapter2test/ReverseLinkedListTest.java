package org.ctci.java8.chapter2test;

import org.ctci.java8.chapter2.LinkedListNode;
import org.ctci.java8.chapter2.ReverseLinkedList;
import org.junit.Test;

public class ReverseLinkedListTest {

	ReverseLinkedList obj = new ReverseLinkedList();

	@Test
	public void testIterative() {
		LinkedListNode first = new LinkedListNode(0, null, null);
		final LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 7; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}

		// assertEquals(null, this.obj.reverseLinkedList(head));
		LinkedListNode reversedList = this.obj.reverseLinkedList(head);
		while (reversedList != null) {
			System.out.println(reversedList.data);
			reversedList = reversedList.next;

		}
	}

	@Test
	public void testRecursive() {
		LinkedListNode first = new LinkedListNode(0, null, null);
		final LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 7; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}

		// assertEquals(null, this.obj.reverseLinkedList(head));
		LinkedListNode reversedList = this.obj.reverseLinkedListRecursive(head);
		while (reversedList != null) {
			System.out.println(reversedList.data);
			reversedList = reversedList.next;

		}
	}

}
