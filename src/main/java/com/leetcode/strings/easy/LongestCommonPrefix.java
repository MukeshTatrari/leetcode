package com.leetcode.strings.easy;

import java.util.Arrays;

/**
 * 
 * @author mukesh
 * 
 *         Write a function to find the longest common prefix string amongst an
 *         array of strings.
 * 
 *         If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 *         Input: strs = ["dog","racecar","car"] Output: "" Explanation: There
 *         is no common prefix among the input strings.
 * 
 * 
 *         Constraints:
 * 
 *         1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists
 *         of only lower-case English letters.
 *
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {

		LongestCommonPrefix s = new LongestCommonPrefix();
		String sequence = s.longestCommonPrefix(new String[] { "cat", "cecar", "car" });
		System.out.println("sequence:::: " + sequence);

	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		} else {
			for (int i = 0; i < strs[0].length(); i++) {
				char c = strs[0].charAt(i);
				for (int j = 1; j < strs.length; j++) {
					if (i == strs[j].length() || strs[j].charAt(i) != c)
						return strs[0].substring(0, i);
				}
			}
			return strs[0];
		}
	}

}
