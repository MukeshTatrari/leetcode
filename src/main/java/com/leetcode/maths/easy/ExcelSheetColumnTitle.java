package com.leetcode.maths.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author mukesh
 *
 *         Given an integer columnNumber, return its corresponding column title
 *         as it appears in an Excel sheet.
 * 
 *         For example:
 * 
 *         A -> 1 B -> 2 C -> 3 ... Z -> 26 AA -> 27 AB -> 28 ...
 * 
 * 
 *         Example 1:
 * 
 *         Input: columnNumber = 1 Output: "A" Example 2:
 * 
 *         Input: columnNumber = 28 Output: "AB" Example 3:
 * 
 *         Input: columnNumber = 701 Output: "ZY"
 * 
 * 
 *         Constraints:
 * 
 *         1 <= columnNumber <= 231 - 1
 */

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {

		ExcelSheetColumnTitle et = new ExcelSheetColumnTitle();
		String column = et.convertToTitle(701);
		System.out.println("Column Number is ::: " + column);

	}

	public String convertToTitle(int n) {
		StringBuffer result = new StringBuffer();
		char ch;
		while (n > 0) {
			ch = (char) ((int) 'A' + (n - 1) % 26);
			n = (n - 1) / 26;
			result.append(ch);
		}
		return new String(result.reverse());
	}

	public String convertToTitle1(int n) {
		String result = "";
		char ch;
		while (n > 0) {
			ch = (char) ((int) 'A' + (n - 1) % 26);
			n = (n - 1) / 26;
			result = ch + result;
		}
		return result;
	}

	public String convertToTitle2(int columnNumber) {
		StringBuffer res = new StringBuffer();
		Map<Integer, Character> dict = new HashMap<>();

		char c = 'A';
		for (int i = 1; i <= 25; i++) {
			dict.put(i, c);
			c++;
		}
		dict.put(0, 'Z');

		int curr = columnNumber;
		while (curr != 0) {
			int rem = curr % 26;
			res.append(dict.get(rem));

			if (curr <= 26)
				break;
			curr = rem == 0 ? curr / 26 - 1 : curr / 26;
		}
		return res.reverse().toString();
	}

}
