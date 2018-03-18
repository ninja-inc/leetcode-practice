package com.ninja.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TwoSumTest {
	TwoSum twoSum = new TwoSum();

	@Test
	public void test1() {
		assertThat(twoSum.sum(new int[] {2,7,11,15}, 9))
				.isEqualTo(new int[] {0,1});
	}

	@Test
	public void test2() {
		assertThat(twoSum.sum(new int[] {2,7,11,15,18,22,39,44,51}, 62))
				.isEqualTo(new int[] {2,8});
	}
}
