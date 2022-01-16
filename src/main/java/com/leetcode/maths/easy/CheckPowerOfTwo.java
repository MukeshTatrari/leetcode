package com.leetcode.maths.easy;

public class CheckPowerOfTwo {

	public static void main(String[] args) {

		CheckPowerOfTwo pt = new CheckPowerOfTwo();
		boolean ps = pt.isPowerOfThree(45);
		System.out.println("Is Power of Two ::: " + ps);

	}

	public boolean isPowerOfTwo(int n) {
		return n > 0 && (n & n - 1) == 0;
	}

	public boolean isPowerOfTwo1(int n) {
		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		if (n % 2 == 1)
			return false;
		return isPowerOfTwo(n / 2);
	}

	public boolean isPowerOfThree(int n) {

		if (n <= 0)
			return false;
		if (n == 1)
			return true;
		if (n % 3 == 1 || n%3==2)
			return false;
		return isPowerOfThree(n / 3);

	}
}
