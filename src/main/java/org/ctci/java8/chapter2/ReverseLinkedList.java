package org.ctci.java8.chapter2;

public class ReverseLinkedList {

	public LinkedListNode reverseLinkedList(final LinkedListNode head) {
		LinkedListNode prev = null;
		LinkedListNode current = head;
		LinkedListNode next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}
