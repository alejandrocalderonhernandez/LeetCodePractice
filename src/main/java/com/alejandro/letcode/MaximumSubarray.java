package com.alejandro.letcode;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        if (nums == null) {
            return 0;
        }

        int maxSum = nums[0];
        int partialMaxSum = 0;

        for (Integer num: nums) {
            partialMaxSum = Math.max(partialMaxSum + num, num);
            maxSum = Math.max(partialMaxSum, maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums1));
        // Expected: 6

        int[] nums2 = {1};
        System.out.println(maxSubArray(nums2));
        // Expected: 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(nums3));
        // Expected: 23
    }
}
