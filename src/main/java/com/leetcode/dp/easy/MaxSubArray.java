package com.leetcode.dp.easy;

/**
 * 
 * @author mukesh
 * 
 * 
 *         Given an integer array nums, find the contiguous subarray (containing
 *         at least one number) which has the largest sum and return its sum.
 * 
 *         A subarray is a contiguous part of an array.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation:
 *         [4,-1,2,1] has the largest sum = 6. Example 2:
 * 
 *         Input: nums = [1] Output: 1 Example 3:
 * 
 *         Input: nums = [5,4,-1,7,8] Output: 23
 * 
 * 
 *         Constraints:
 * 
 *         1 <= nums.length <= 105 -104 <= nums[i] <= 104
 * 
 * 
 *         Follow up: If you have figured out the O(n) solution, try coding
 *         another solution using the divide and conquer approach, which is more
 *         subtle.
 *
 */
public class MaxSubArray {
	public static void main(String[] args) {

		MaxSubArray sub = new MaxSubArray();
		int max = sub.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		System.out.println("Max sub array :::" + max);

	}

	public int maxSubArray(int[] nums) {
		int sum = 0;
		int maxSum = nums[0];
		int start = 0,end = 0, s = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (maxSum < sum) {
				maxSum = sum;
				start = s;
                end = i;
			}
			if (sum < 0) {
				sum = 0;
				s = i + 1;
			}

		}
		
		return maxSum;
	}

}
