package com.ninja.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ReverseIntegerTest {
	ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	public void test1() {
		assertThat(reverseInteger.reverse(123)).isEqualTo(321);
	}

	@Test
	public void test2() {
		assertThat(reverseInteger.reverse(1234567890)).isEqualTo(987654321);
	}

	@Test
	public void test3() {
		assertThat(reverseInteger.reverse(-123)).isEqualTo(-321);
	}

	@Test
	public void test11() {
		assertThat(reverseInteger.reverse2(123)).isEqualTo(321);
	}

	@Test
	public void test12() {
		assertThat(reverseInteger.reverse2(1234567890)).isEqualTo(987654321);
	}

	@Test
	public void test13() {
		assertThat(reverseInteger.reverse2(-123)).isEqualTo(-321);
	}
}
