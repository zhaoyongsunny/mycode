package com.codeboy.leetcode.common;

public class ListNodeUtil {

	public static ListNode createListNode(int values[]) {
		ListNode head = new ListNode(values[0]);
		ListNode travler = head;
		for(int i=1;i<values.length;i++){
			travler.next = new 	ListNode(values[i]);
			travler = travler.next;
		}
		return head;
	}
	
	public static void printListNode(ListNode head){
		while(head!=null){
			System.out.print(head.val);
			System.out.print(",");
			head=head.next;
		}
	}
}
