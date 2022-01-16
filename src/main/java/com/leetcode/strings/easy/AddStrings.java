package com.leetcode.strings.easy;

import java.math.BigInteger;

/**
 * 
 * @author mukesh
 * 
 *         Given two non-negative integers, num1 and num2 represented as string,
 *         return the sum of num1 and num2 as a string.
 * 
 *         You must solve the problem without using any built-in library for
 *         handling large integers (such as BigInteger). You must also not
 *         convert the inputs to integers directly.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: num1 = "11", num2 = "123" Output: "134" Example 2:
 * 
 *         Input: num1 = "456", num2 = "77" Output: "533" Example 3:
 * 
 *         Input: num1 = "0", num2 = "0" Output: "0"
 * 
 * 
 *         Constraints:
 * 
 *         1 <= num1.length, num2.length <= 104 num1 and num2 consist of only
 *         digits. num1 and num2 don't have any leading zeros except for the
 *         zero itself.
 *
 */
public class AddStrings {
	public static void main(String[] args) {

		AddStrings s = new AddStrings();
		String sum = s.addStrings("11", "123");
		System.out.println("Sum of Strings :::: " + sum);

	}

	public String addStrings(String num1, String num2) {

		BigInteger x = new BigInteger(num1);
		BigInteger p = new BigInteger(num2);
		
		BigInteger sum = x.add(p);
		
		return sum.toString();

	}

}
