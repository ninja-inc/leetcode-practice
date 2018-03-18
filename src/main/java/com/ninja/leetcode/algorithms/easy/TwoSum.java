package com.ninja.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018-03-18
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * O(n^2)??
 *
 * j: (n-1) + (n-2) + (n-3) + ... (n - n-1)
 * = Xn - y
 * = n
 *
 */
public class TwoSum {
	public int[] sum(int[] nums, int target) {
		int i,j = 0;

		process:
		for (i=0; i < nums.length - 1; i++) {
			for (j=i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					break process;
				}
			}
		}

		int[] ans = {i,j};

		return ans;
	}

	/**
	 * https://leetcode.com/problems/two-sum/discuss/3/Accepted-Java-O(n)-Solution
	 * O(n) solution
	 *
	 * https://stackoverflow.com/questions/8923251/what-is-the-time-complexity-of-hashmap-containskey-in-java
	 * map.containsKey ... O(1)
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i + 1;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i + 1);
		}
		return result;
	}
}
