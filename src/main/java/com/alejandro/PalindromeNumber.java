package com.alejandro;

public class PalindromeNumber {

    public static void main(String[] args) {

        PalindromeNumber solution = new PalindromeNumber();

        // Test Case 1 - Simple
        int x1 = 121;
        System.out.println("Test Case 1 -> " + solution.isPalindrome(x1)); // Expected: true

        // Test Case 2 - Medium
        int x2 = -121;
        System.out.println("Test Case 2 -> " + solution.isPalindrome(x2)); // Expected: false

        // Test Case 3 - Hard
        int x3 = 123454321;
        System.out.println("Test Case 3 -> " + solution.isPalindrome(x3)); // Expected: true
    }

    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }


        String str = String.valueOf(x);

        for (int i = 0, j = str.length() - 1; i < j; i ++, j --) {

            if (str.charAt(j) != str.charAt(i)) {
                return false;
            }

        }

        return true;
    }

    public boolean isPalindromeV2(int x) {

        if(x < 0) {
            return false;
        }

        StringBuilder s1 = new StringBuilder(String.valueOf(x)).reverse();
        String s2 = String.valueOf(x);

        return s1.toString().equals(s2);
    }

}