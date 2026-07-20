package com.alejandro;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {


        int freeSpace = 0;
        int countZero = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[freeSpace] = nums[i];
                freeSpace ++;

            } else {
                countZero ++;
            }
        }

        for (int i = nums.length - 1 ; i > nums.length - countZero - 1; i-- ) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));
        // Expected: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));
        // Expected: [0]

        int[] nums3 = {4, 0, 5, 0, 0, 2, 0, 7};
        moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));
        // Expected: [4, 5, 2, 7, 0, 0, 0, 0]
    }
}
