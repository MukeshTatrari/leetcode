package com.leetcode.maths.easy;

import java.util.Arrays;

/**
 * 
 * @author mukesh
 * 
 *         Given an integer array nums, find three numbers whose product is
 *         maximum and return the maximum product.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [1,2,3] Output: 6 Example 2:
 * 
 *         Input: nums = [1,2,3,4] Output: 24 Example 3:
 * 
 *         Input: nums = [-1,-2,-3] Output: -6
 * 
 * 
 *         Constraints:
 * 
 *         3 <= nums.length <= 104 -1000 <= nums[i] <= 1000
 *
 */
public class MaxProduct {

	public static void main(String[] args) {
		MaxProduct mp = new MaxProduct();
		int product = mp.maximumProduct(new int[] { -1, -2, -3, 4,5 });
		System.out.println("Max product is ::: " + product);

	}

	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
        		nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    
	}

}
