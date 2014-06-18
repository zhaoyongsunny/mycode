package com.codeboy.leetcode;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/***
 * http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ Say you
 * have an array for which the ith element is the price of a given stock on day
 * i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * 
 * ? how about find the big sum ?
 * 
 * @author zhaoyong
 * 
 * 
 */
public class A5_Best_Time_to_Buy_and_Sell_Stock_Test  extends TestCase {

	@Test
	public void test() {
		A5_Best_Time_to_Buy_and_Sell_Stock finder = new A5_Best_Time_to_Buy_and_Sell_Stock();

		Assert.assertEquals(finder.maxProfit(new int[]{1})  , 0); 
		Assert.assertEquals(finder.maxProfit(new int[]{1,2})  ,1); 
		Assert.assertEquals(finder.maxProfit(new int[]{2,1,4})  ,3); 
		Assert.assertEquals(finder.maxProfit(new int[]{4,1,2})  ,1); 
		Assert.assertEquals(finder.maxProfit(new int[]{2,1})  ,0); 
		
		Assert.assertEquals(finder.maxProfit(new int[]{3,2,6,5,0,3}),4);
	 

	}
	

	@Test
	public void test2() {
		A5_Best_Time_to_Buy_and_Sell_Stock finder = new A5_Best_Time_to_Buy_and_Sell_Stock();

		Assert.assertEquals(finder.maxProfit2(new int[]{1})  , 0); 
		Assert.assertEquals(finder.maxProfit2(new int[]{1,2})  ,1); 
		Assert.assertEquals(finder.maxProfit2(new int[]{2,1,4})  ,3); 
		Assert.assertEquals(finder.maxProfit2(new int[]{4,1,2})  ,1); 
		Assert.assertEquals(finder.maxProfit2(new int[]{2,1})  ,0); 
		
		Assert.assertEquals(finder.maxProfit2(new int[]{3,2,6,5,0,3}),4);
	 

	}

}
