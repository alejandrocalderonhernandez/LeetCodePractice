package com.alejandro.letcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class ValidParentheses {

    public static void main(String[] args) {

        ValidParentheses solution = new ValidParentheses();

        // Test Case 1 - Simple
       String s1 = "){";
       System.out.println(
               "Test Case 1 -> " + solution.isValid(s1)
       ); // Expected: true

        // Test Case 2 - Medium
        String s2 = "([{}])";
        System.out.println(
                "Test Case 2 -> " + solution.isValid(s2)
        ); // Expected: true

        // Test Case 3 - Hard
       String s3 = "({[)]})";
       System.out.println(
               "Test Case 3 -> " + solution.isValid(s3)
       ); // Expected: false

    }

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : chars) {

            if (c == '{' || c == '[' || c == '(')
                stack.push(c);

            try {
                if (c == '}')
                    if (stack.pop() != '{') return false;
                if (c == ']')
                    if (stack.pop() != '[') return false;
                if (c == ')')
                    if (stack.pop() != '(') return false;
            } catch (NoSuchElementException e) {
                return false;
            }

        }

        return stack.isEmpty();
    }
}