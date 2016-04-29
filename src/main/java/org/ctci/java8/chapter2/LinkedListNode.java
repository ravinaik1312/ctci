package org.ctci.java8.chapter2;

public class LinkedListNode {
	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode last;
	public int data;

	public LinkedListNode(final int d, final LinkedListNode n, final LinkedListNode p) {
		this.data = d;
		this.setNext(n);
		this.setPrevious(p);
	}

	public LinkedListNode() {
	}

	public void setNext(final LinkedListNode n) {
		this.next = n;
		if (this == this.last) {
			this.last = n;
		}
		if (n != null && n.prev != this) {
			n.setPrevious(this);
		}
	}

	public void setPrevious(final LinkedListNode p) {
		this.prev = p;
		if (p != null && p.next != this) {
			p.setNext(this);
		}
	}

	public String printForward() {
		if (this.next != null) {
			return this.data + "->" + this.next.printForward();
		} else {
			return ((Integer) this.data).toString();
		}
	}

	@Override
	public LinkedListNode clone() {
		LinkedListNode next2 = null;
		if (this.next != null) {
			next2 = this.next.clone();
		}
		final LinkedListNode head2 = new LinkedListNode(this.data, next2, null);
		return head2;
	}
}
