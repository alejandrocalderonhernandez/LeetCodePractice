package com.alejandro.letcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {

        ContainsDuplicate solution = new ContainsDuplicate();

        int[] case1 = {1, 2, 3, 1};
        System.out.println("Case 1 -> " + solution.containsDuplicate(case1));

        int[] case2 = {
                5, 7, 12, 19, 3, 8, 21, 14,
                6, 9, 11, 18, 25, 30, 2, 16,
                5
        };
        System.out.println("Case 2 -> " + solution.containsDuplicate(case2));

        int[] case3 = {
                100, 45, 32, 78, 91, 16, 205, 310,
                411, 512, 613, 714, 815, 916, 1017,
                1118, 1219, 1320, 1421, 1522, 1623,
                1724, 1825, 1926, 2027, 2128, 2229,
                2330, 2431, 2532
        };
        System.out.println("Case 3 -> " + solution.containsDuplicate(case3));
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>(nums.length);

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }
            set.add(num);


        }

        return false;
    }

}