package com.alejandro.letcode;
import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int write = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {

            if (nums1[p1] > nums2[p2]) {
                nums1[write] = nums1[p1];
                p1--;
            } else {
                nums1[write] = nums2[p2];
                p2--;
            }

            write--;
        }

        while (p2 >= 0) {
            nums1[write] = nums2[p2];
            p2--;
            write--;
        }
    }

    public static void main(String[] args) {
//
       int[] nums1 = {1,0};
       int[] nums2 = {2};
       merge(nums1, 1, nums2, 1);
       System.out.println(Arrays.toString(nums1));
      //  // Expected: [1, 2, 2, 3, 5, 6]

        int[] nums3 = {1,2,3,0,0,0};
        int[] nums4 = {4,5,6};
        merge(nums3, 3, nums4, 3);
        System.out.println(Arrays.toString(nums3));
        // Expected: [1]

       int[] nums5 = {4,5,6,0,0,0,0};
       int[] nums6 = {1,2,3,7};
       merge(nums5, 3, nums6, 4);
       System.out.println(Arrays.toString(nums5));
       // // Expected: [1]
    }
}
