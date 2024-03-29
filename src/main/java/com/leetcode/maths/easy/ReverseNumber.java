package com.leetcode.maths.easy;

/**
 * 
 * 
 * @author mukesh
 * 
 *         Given a signed 32-bit integer x, return x with its digits reversed.
 *         If reversing x causes the value to go outside the signed 32-bit
 *         integer range [-231, 231 - 1], then return 0.
 * 
 *         Assume the environment does not allow you to store 64-bit integers
 *         (signed or unsigned).
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: x = 123 Output: 321 Example 2:
 * 
 *         Input: x = -123 Output: -321 Example 3:
 * 
 *         Input: x = 120 Output: 21
 * 
 * 
 *         Constraints:
 * 
 *         -231 <= x <= 231 - 1
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {

		ReverseNumber rs = new ReverseNumber();
		int p = rs.reverse(1000000045);
		System.out.println("reverse of the number is ::: " + p);

	}

	public int reverse(int x) {
		int reverse = 0;
		boolean isNegative = false;
		if (x < 0) {
			isNegative = true;
			x = x * (-1);

		}

		int prev_rev_num = 0;
		while (x > 0) {
			int p = x % 10;
			reverse = reverse * 10 + p;

			if ((reverse - p) / 10 != prev_rev_num) {
				System.out.println("WARNING OVERFLOWED!!!");
				return 0;
			}
			prev_rev_num = reverse;
			x = x / 10;
		}
		if (isNegative) {
			return -1 * (reverse);
		}
		return reverse;
	}

}
