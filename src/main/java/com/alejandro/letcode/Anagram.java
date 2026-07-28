package com.alejandro.letcode;

import java.util.HashMap;
import java.util.Map;


public class Anagram {

    public static void main(String[] args) {

        Anagram solution = new Anagram();

        // Test Case 1 - Simple
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println("Test Case 1 -> " + solution.isAnagram(s1, t1)); // True

        // Test Case 2 - Medium
        String s2 = "programming";
        String t2 = "grmmargapin";
        System.out.println("Test Case 2 -> " + solution.isAnagram(s2, t2)); // False

        // Test Case 3 - Hard
        String s3 = "abcdefghijklmnopqrstuvwxyz";
        String t3 = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("Test Case 3 -> " + solution.isAnagram(s3, t3)); // True
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> mapS = new HashMap<>(s.length());
        Map<Character, Integer> mapT = new HashMap<>(t.length());

        for (int i = 0; i < s.length(); i ++) {


            mapS.merge(s.charAt(i), 1, Integer::sum);
            mapT.merge(t.charAt(i), 1, Integer::sum);
        }


        return mapT.equals(mapS);
    }

}