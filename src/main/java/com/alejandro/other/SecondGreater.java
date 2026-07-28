package com.alejandro.other;

public class SecondGreater {

    public static int findSecondGreater(int[] nums) {

        if(nums.length <= 1) {
            return -1;
        }

        int greater = Math.max(nums[0], nums[1]);
        int secondGreater =  Math.min(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {

            if (nums[i] > secondGreater) {

                if (nums[i] != greater) {
                    secondGreater = Math.min(nums[i], greater);
                    greater = Math.max(nums[i], greater);
                }

            }

        }

        return secondGreater;
    }

    public static void main(String[] args) {

        int[] nums1 = {10, 5, 8};
        System.out.println(findSecondGreater(nums1)); // 8

        int[] nums2 = {1, 2, 3, 4, 9, 7, 8, 0, 10};
        System.out.println(findSecondGreater(nums2)); // 9

        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println(findSecondGreater(nums3)); // 4

        int[] nums4 = {1, 2, 3, 4, 5};
        System.out.println(findSecondGreater(nums4)); // 4

        int[] nums5 = {8, 1, 8, 5, 7};
        System.out.println(findSecondGreater(nums5)); // 7
    }
}


