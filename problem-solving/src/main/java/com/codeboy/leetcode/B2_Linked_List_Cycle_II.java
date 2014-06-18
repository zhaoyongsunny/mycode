package com.codeboy.leetcode;

import com.codeboy.leetcode.common.ListNode;

/***
 * https://oj.leetcode.com/problems/linked-list-cycle-ii/
 * 
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * Follow up: Can you solve it without using extra space? *
 * 
 * @author zhaoyong
 * 
 */
public class B2_Linked_List_Cycle_II {
	  public ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;

		ListNode meetNode = null;
		// how to evaluate the performance of this ?
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast){
				meetNode = slow;
				break;
			}
		}

		  //no cycle
        if(fast == null || fast.next  == null){
            return null;
        }
        
        //exist cycle
        //the distance is equal from the intersection and head to 
        //cycle begins.
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
	}

}
