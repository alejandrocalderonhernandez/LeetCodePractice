package com.alejandro.other;

import java.util.Arrays;
import java.util.Comparator;

public class SecondGreater {

    public static int findSecondGreater(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())  // Invoca el método, retorna un Comparator
                .skip(1)
                .findFirst()
                .orElse(-1);
    }

    public static int findSecondGreater(int[] nums, int k) {

        return Arrays.stream(nums)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(k - 1)
                .findFirst()
                .orElse(-1);
    }



    public static void main(String[] args) {

        int[] nums1 = {10, 5, 8, 4};
        System.out.println(findSecondGreater(nums1, 3)); // 8

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


