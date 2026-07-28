package com.alejandro.letcode;

public class BinarySearch {

    public static void main(String[] args) {

        BinarySearch solution = new BinarySearch();

        // Test Case 1 - Simple
        int[] nums1 = {-1, 0, 3, 5, 9, 12, 0};

        System.out.println(nums1.length / 2);
        System.out.println(
                "Test Case 1 -> " + solution.search(nums1, 9)
        ); // Expected: 4

        // Test Case 2 - Medium
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println(
                "Test Case 2 -> " + solution.search(nums2, target2)
        ); // Expected: -1

        // Test Case 3 - Hard
        int[] nums3 = {-25, -10, -3, 0, 7, 12, 19, 24, 31, 45, 58, 73, 91};
        int target3 = 73;
        System.out.println(
                "Test Case 3 -> " + solution.search(nums3, target3)
        ); // Expected: 11
    }

    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int rightPointer = nums.length;
        int halfPointer = nums.length / 2;


        if (nums[halfPointer] == target) {
            return halfPointer;
        }

        while(halfPointer != rightPointer && halfPointer != leftPointer) {

            if (target > nums[halfPointer]) {
                leftPointer = halfPointer;
                halfPointer = leftPointer + ((rightPointer - leftPointer) / 2);

            } else {
                rightPointer = halfPointer;
                halfPointer /= 2;
            }

            if (nums[halfPointer] == target) {
                return halfPointer;
            }
        }

        return -1;
    }
}