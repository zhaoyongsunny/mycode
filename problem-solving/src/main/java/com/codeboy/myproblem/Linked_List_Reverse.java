package com.codeboy.myproblem;

import com.codeboy.leetcode.common.ListNode;

/***
 * assume there is no loop in the linked list
 * @author zhaoyong
 *
 */
public class Linked_List_Reverse {

	public static ListNode reverseLinkedList(ListNode head) {
		if(head!=null&&head.next!=null){
			ListNode current = head.next ;
			head.next = null;
			while(current!=null){
				ListNode temp = current.next;
				current.next=head;
				head=current;
				//1->2->3->4
				current=temp;
			}
		}
		return head;
	}
	
	public static ListNode reverseLinkedListRecursive(ListNode head) {
		if(head!=null&&head.next!=null){
			ListNode newTail = head.next;
			head.next = null;
			ListNode newHead = reverseLinkedListRecursive(newTail);
			newTail.next=head;
			return newHead;
		}else{
			return head;
	
		}
	}
}
