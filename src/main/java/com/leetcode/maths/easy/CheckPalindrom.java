package com.leetcode.maths.easy;

public class CheckPalindrom {

	public static void main(String[] args) {
		CheckPalindrom ps = new CheckPalindrom();
		boolean isPalindrom = ps.isPalindrome(-121);
		System.out.println("Is Palindrom ::::: " + isPalindrom);
	}

	public boolean isPalindrome(int x) {
		int reverse = 0;
		int original = x;
		if(x<0) {
			return false;
		}
		while (x != 0) {
			int p = x % 10;
			reverse = reverse * 10 + p;
			x = x / 10;
		}
		System.out.println("reverse ::: " + reverse);
		if (reverse == original) {
			return true;
		}
		return false;
	}
}
