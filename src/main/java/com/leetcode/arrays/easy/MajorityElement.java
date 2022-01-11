package com.leetcode.arrays.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author mukesh
 * 
 *         Given an array nums of size n, return the majority element.
 * 
 *         The majority element is the element that appears more than ⌊n / 2⌋
 *         times. You may assume that the majority element always exists in the
 *         array.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [3,2,3] Output: 3 Example 2:
 * 
 *         Input: nums = [2,2,1,1,1,2,2] Output: 2
 * 
 * 
 *         Constraints:
 * 
 *         n == nums.length 1 <= n <= 5 * 104 -231 <= nums[i] <= 231 - 1
 * 
 * 
 *         Follow-up: Could you solve the problem in linear time and in O(1)
 *         space?
 *
 */

public class MajorityElement {
	public static void main(String[] args) {

		MajorityElement m = new MajorityElement();
		int element = m.majorityElement(new int[] { 3,3,4 });
		System.out.println("element ::" + element);
	}

	public int majorityElement(int[] nums) {

		int x = nums.length / 2;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}

		}

		int max = 0;
		int maxEntry = 0;
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > max) {
				maxEntry = e.getKey();
				max = e.getValue();
			}
		}

		return maxEntry;
	}
}
