package com.ninja.leetcode.algorithms.easy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ValidParenthesesTest {
	ValidParentheses exec = new ValidParentheses();

	@Test
	public void test1() {
		assertThat(exec.isValid("({[]})")).isTrue();
	}

	@Test
	public void test2() {
		assertThat(exec.isValid("(}")).isFalse();
	}

	@Test
	public void test3() {
		assertThat(exec.isValid("[{hogehoge},{foofoo}]")).isTrue();
	}

	@Test
	public void test4() {
		assertThat(exec.isValid("[{hogehoge}],{foofoo}]")).isFalse();
	}

	@Test
	public void test5() {
		assertThat(exec.isValid("[}}]")).isFalse();
	}
}
