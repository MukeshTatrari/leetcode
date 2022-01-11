package com.leetcode.arrays.easy;

/**
 * 
 * @author mukesh
 *
 *
 *         You are given an array prices where prices[i] is the price of a given
 *         stock on the ith day.
 * 
 *         You want to maximize your profit by choosing a single day to buy one
 *         stock and choosing a different day in the future to sell that stock.
 * 
 *         Return the maximum profit you can achieve from this transaction. If
 *         you cannot achieve any profit, return 0.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2
 *         (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note
 *         that buying on day 2 and selling on day 1 is not allowed because you
 *         must buy before you sell. Example 2:
 * 
 *         Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no
 *         transactions are done and the max profit = 0.
 * 
 * 
 *         Constraints:
 * 
 *         1 <= prices.length <= 105 0 <= prices[i] <= 104
 *
 */

public class MaxProfit {

	public static void main(String[] args) {

		int[] stocks = new int[] { 7, 1, 5, 3, 6, 4 };
		MaxProfit ms = new MaxProfit();
		int profit = ms.maxProfit(stocks);
		System.out.println("max profit :: " + profit);

	}

	/**
	 * 
	 * @param stocks
	 * @return
	 * 
	 * time complexity is in o(n2)
	 */
	public int maximumProfit(int[] stocks) {
		int maxProfit = 0;
		for (int i = 0; i < stocks.length - 1; i++) {
			for (int j = i + 1; j < stocks.length; j++) {
				int diff = stocks[j] - stocks[i];
				if (diff > maxProfit) {
					maxProfit = diff;
				}

			}
		}
		return maxProfit;
	}

	/**
	 * 
	 * @param stocks
	 * @return
	 * 
	 * time complexity is in o(n)
	 */
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = prices[0];
		for (int i = 1; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}

		return maxProfit;
	}
}
