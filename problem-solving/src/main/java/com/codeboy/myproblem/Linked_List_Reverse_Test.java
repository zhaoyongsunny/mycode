package com.codeboy.myproblem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import com.codeboy.leetcode.common.ListNode;
import com.codeboy.leetcode.common.ListNodeUtil;

/***
 * assume there is no loop in the linked list
 * 
 * @author zhaoyong
 * 
 */
public class Linked_List_Reverse_Test

extends TestCase {

	@Test
	public void testRecursive() {
		ListNode head = ListNodeUtil.createListNode(new int[] { 1, 2, 3, 4 });
		ListNode reversed =Linked_List_Reverse.reverseLinkedListRecursive(head); 
		Assert.assertEquals( reversed.val, 4);
		Assert.assertEquals( reversed.next.val, 3);
		Assert.assertEquals( reversed.next.next.val, 2);

		Assert.assertEquals( reversed.next.next.next.val, 1);

		Assert.assertEquals( reversed.next.next.next.next, null);

		head = ListNodeUtil.createListNode(new int[] { 1 });
		Assert.assertEquals(
				Linked_List_Reverse.reverseLinkedListRecursive(head).val, 1);
		head = ListNodeUtil.createListNode(new int[] { 1, 2 });
		Assert.assertEquals(
				Linked_List_Reverse.reverseLinkedListRecursive(head).val, 2);
	}
	
	@Test
	public void test() {
		ListNode head = ListNodeUtil.createListNode(new int[] { 1, 2, 3, 4 });
		ListNode reversed =Linked_List_Reverse.reverseLinkedList(head); 
		Assert.assertEquals( reversed.val, 4);
		Assert.assertEquals( reversed.next.val, 3);
		Assert.assertEquals( reversed.next.next.val, 2);

		Assert.assertEquals( reversed.next.next.next.val, 1);

		Assert.assertEquals( reversed.next.next.next.next, null);

		head = ListNodeUtil.createListNode(new int[] { 1 });
		Assert.assertEquals(
				Linked_List_Reverse.reverseLinkedList(head).val, 1);
		head = ListNodeUtil.createListNode(new int[] { 1, 2 });
		Assert.assertEquals(
				Linked_List_Reverse.reverseLinkedList(head).val, 2);
	}
}
