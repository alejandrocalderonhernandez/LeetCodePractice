package com.alejandro;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] res =  new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                res[0] = map.get(diff);
                res[1] = i;
                return res;
            }

            map.put(nums[i], i);

        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums1, 9)));
        // Expected: [0, 1]

        int[] nums2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
        // Expected: [1, 2]

        int[] nums3 = {-10, 20, 5, 15, -5, 30};
        System.out.println(Arrays.toString(twoSum(nums3, 20)));
        // Expected: [0, 5]
    }
}