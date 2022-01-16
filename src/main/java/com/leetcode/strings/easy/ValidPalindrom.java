package com.leetcode.strings.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given a string s, return true if the s can be palindrome after
 *         deleting at most one character from it.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: s = "aba" Output: true Example 2:
 * 
 *         Input: s = "abca" Output: true Explanation: You could delete the
 *         character 'c'. Example 3:
 * 
 *         Input: s = "abc" Output: false
 * 
 * 
 *         Constraints:
 * 
 *         1 <= s.length <= 105 s consists of lowercase English letters.
 *
 */
public class ValidPalindrom {

	public static void main(String[] args) {
		ValidPalindrom vp = new ValidPalindrom();
		boolean isValid = vp.validPalindrome("abcbca");
		System.out.println("Is Valid Palindrom ::: " + isValid);
	}

	public boolean validPalindrome(String s) {

		// Declare two pointers
		int left = 0;
		int right = s.length() - 1;

		/*
		 * Run a loop while left pointer is less than or equal to right pointer.
		 */
		while (left <= right) {

			if (s.charAt(left) != s.charAt(right)) {

				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
			}

			left++;
			right--;
		}

		return true;
	}

	// Logic to check palindrome
	private boolean isPalindrome(String s, int start, int end) {

		while (start <= end) {

			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

}
