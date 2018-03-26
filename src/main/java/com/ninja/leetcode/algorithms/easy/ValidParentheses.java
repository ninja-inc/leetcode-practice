package com.ninja.leetcode.algorithms.easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Data;

/*
https://leetcode.com/problems/valid-parentheses/description/

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	public boolean isValid(String string) {
		List<Parentheses> parentheseses = Arrays.asList(
			new Parentheses("(", ")"), new Parentheses("{", "}"), new Parentheses("[", "]")
		);

		Deque<String> lifo = new ArrayDeque<>();

		for (char c : string.toCharArray()) {
			String s = String.valueOf(c);

			if (parentheseses.stream().filter(p -> p.getStart().equals(s)).findFirst().isPresent()) {
				lifo.addLast(s);
			} else if (parentheseses.stream().filter(p -> p.getEnd().equals(s)).findFirst().isPresent()) {
				if (lifo.size() == 0) return false;

				if (!parentheseses.stream().filter(p -> p.getEnd().equals(s)).findFirst().get().getStart().equals(lifo.getLast())) {
					return false;
				} else {
					lifo.removeLast();
				}
			}
		}

		return lifo.size() == 0;
	}
}

@Data
@AllArgsConstructor
class Parentheses {
	private String start;
	private String end;
}
