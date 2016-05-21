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

	public LinkedListNode reverseLinkedListRecursive(final LinkedListNode head) {
		if (head.next == null) {
			return head;
		}
		else {
			final LinkedListNode reversedList = this.reverseLinkedList(head.next);
			reversedList.next = head;
			reversedList.next.next = null;
			return reversedList;
		}

	}
}
