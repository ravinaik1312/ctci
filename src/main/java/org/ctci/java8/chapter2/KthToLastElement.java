package org.ctci.java8.chapter2;

public class KthToLastElement {

	public LinkedListNode getKthToLastElement(LinkedListNode head, int k) {
		LinkedListNode n1 = head;
		LinkedListNode n2 = head;
		if(k <=0) return null;
		for(int i=1; i<k; i++) {
			if(n2.next!=null){
				n2 = n2.next;
			}
			else
			{
				return null;
			}
		}
		
		if(n2==null){
			return null;
		}
		
		while(n2.next!=null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n1;
		
		
	}

}
