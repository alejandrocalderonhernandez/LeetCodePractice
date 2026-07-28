package com.alejandro.other;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency {

    public static Map<Character, Integer> frequency(String s) {

        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            frequency.merge(s.charAt(i), 1 , Integer::sum);
        }

        return frequency;
    }

    public static void main(String[] args) {
        System.out.println(frequency("banana"));
    }
}
