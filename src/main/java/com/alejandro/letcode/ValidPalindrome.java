package com.alejandro.letcode;

import java.util.Locale;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String str = normalize(s);

        for(int i = 0, j = str.length() - 1; i < j; i++, j --) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    private static String normalize(String s) {
        return s.toLowerCase(Locale.ROOT)
                .chars()
                .filter(Character::isLetterOrDigit)
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append
                )
                .toString();
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));
        // Expected: true

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));
        // Expected: false

        String s3 = ".,";
        System.out.println(isPalindrome(s3));
        // Expected: true
    }
}
