package com.codeboy.leetcode;

import com.codeboy.leetcode.common.ListNode;
import com.codeboy.leetcode.common.ListNodeUtil;

/**
 * https://oj.leetcode.com/problems/sort-list/
 * 
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Sort_List {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		return mergeSort(head,countListLength(head));

	}

	private ListNode mergeSort(ListNode head, int listLength) {
		int middle = listLength/2;
		ListNode left = head;
		ListNode right = null;
		int i = 0;
		while (i != middle) {
			i++;
			
 			if (i == middle) {
				right = head.next;
				head.next = null;
			}else{
				head = head.next;
			}
		}
		// now we have two parts l and r, recursively sort them
		left = sortList(left);
		right = sortList(right);

		// merge together
		ListNode merged = merge(left, right);

		return merged;
	}

 

	private ListNode merge(ListNode left, ListNode right) {
		ListNode head = right;
		ListNode other = left;
		if(left.val<right.val){
			head = left;
			other = right;
		}
		
		ListNode travler  = head;
		ListNode temp= null;
		while (travler!=null){
			while(travler.next!=null&&other.val>=travler.next.val){
				travler = travler.next;
			}
			if(travler.next==null){
				travler.next = other;
				break;
			}else{
				temp = travler.next;
				travler.next = other;
				travler = travler.next;
				other= temp;
			}
		}
		return head;
	}

	private int countListLength(ListNode head) {
		int i = 0;
		while (head != null) {
			head = head.next;
			i++;
		}
		return i;
	}
	
	public static void main(String [] args){
		ListNode head = ListNodeUtil.createListNode(new int[]{1,2,3,4}) ;
//		System.out.println("\n before sorting==================");
//		ListNodeUtil.printListNode(head);
//		System.out.println("\n after sorting==================");
//		ListNodeUtil.printListNode(new Sort_List().sortList(head));
		
		head = ListNodeUtil.createListNode(new int[]{3,2,4}) ;
		System.out.println("\n before sorting==================");
		ListNodeUtil.printListNode(head);
		System.out.println("\n after sorting==================");
		ListNodeUtil.printListNode(new Sort_List().sortList(head));
		
	}
}