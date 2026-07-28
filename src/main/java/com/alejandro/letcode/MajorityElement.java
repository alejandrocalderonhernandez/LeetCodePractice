package com.alejandro.letcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int n = nums.length / 2 ;

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i: nums) {
            map.merge(i, 1, Integer::sum);

            if (map.containsKey(i)) {
                if (map.get(i) > n) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1));
        // Expected: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2));
        // Expected: 2

        int[] nums3 = {6, 5, 5};
        System.out.println(majorityElement(nums3));
        // Expected: 5
    }
}