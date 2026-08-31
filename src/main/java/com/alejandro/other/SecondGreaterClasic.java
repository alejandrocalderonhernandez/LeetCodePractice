package com.alejandro.other;

public class SecondGreaterClasic {

    public static int findSecondGreater(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }

        long greater = Long.MIN_VALUE;
        long secondGreater = Long.MIN_VALUE;

        for (int num : nums) {
            if (num > greater) {
                secondGreater = greater;
                greater = num;
            } else if (num != greater && num > secondGreater) {
                secondGreater = num;
            }
        }

        return secondGreater == Long.MIN_VALUE ? -1 : (int) secondGreater;
    }
}
