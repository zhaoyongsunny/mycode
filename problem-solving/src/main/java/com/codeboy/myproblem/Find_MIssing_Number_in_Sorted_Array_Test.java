package com.codeboy.myproblem;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/***
 * http://oj.leetcode.com/problems/single-number-ii/ Given an array of integers,
 * every element appears three times except for one. Find that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author zhaoyong
 * 
 * 
 */
public class Find_MIssing_Number_in_Sorted_Array_Test extends TestCase {

	@Test
	public void test() {
		  
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{1,2,3}),0);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{1,2,3,4}),0);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{0,2,3,4}),1);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{0,1,3,4}),2);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{0,1,2,4}),3);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumberRecursive(new int[]{0,1,2,3}),4);

		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{1,2,3}),0);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{1,2,3,4}),0);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{0,2,3,4}),1);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{0,1,3,4}),2);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{0,1,2,4}),3);
		Assert.assertEquals(Find_MIssing_Number_in_Sorted_Array.findMissingNumber(new int[]{0,1,2,3}),4);
		
		
	}
 
}

// how about more than twice, and finder a signle one ?
