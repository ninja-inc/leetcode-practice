package com.ninja.leetcode.algorithms.easy;

import lombok.extern.slf4j.Slf4j;

/*
https://leetcode.com/problems/reverse-integer/description/

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output:  321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

 */
@Slf4j
public class ReverseInteger {
	public int reverse(int x) {
		boolean isMinus = false;
		if (0 > x) {
			x = -1*x;
			isMinus = true;
		}

		char[] chars = ("" + x).toCharArray();

		//log.info("{}, {}, {}", chars[0], chars[1], chars[2]);

		int fullSize = chars.length;
		int halfSize = fullSize/2;
		for (int i=0; i<halfSize; i++) {
			char tmp1 = chars[i];
			char tmp2 = chars[fullSize-i-1];

			chars[i] = tmp2;
			chars[fullSize-i-1] = tmp1;
		}

		int ans = Integer.parseInt(String.valueOf(chars));
		if (isMinus) {
			ans = ans*-1;
		}

		return ans;
	}

	/**
	 * https://leetcode.com/problems/reverse-integer/discuss/4127/Simple-Java-Solution-O(N)-time-and-O(1)-space.
	 *
	 */
	public int reverse2(int x) {
		int result =0;
		while(x != 0)
		{
			result = (result*10) + (x%10);
			if(result > Integer.MAX_VALUE) return 0;
			if(result < Integer.MIN_VALUE) return 0;
			x = x/10;
		}
		return result;
	}
}
