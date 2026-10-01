package com.alejandro.letcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock solution =
                new BestTimeToBuyAndSellStock();

        // Test Case 1 - Simple
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(
                "Test Case 1 -> " + solution.maxProfit(prices1)
        ); // Expected: 5

        // Test Case 2 - Medium
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(
                "Test Case 2 -> " + solution.maxProfit(prices2)
        ); // Expected: 0

        // Test Case 3 - Hard
        int[] prices3 = {9, 8, 2, 6, 1, 7, 3, 10, 4};
        System.out.println(
                "Test Case 3 -> " + solution.maxProfit(prices3)
        ); // Expected: 9

        // Test Case 4 - Hard
        int[] prices4 = {3, 2, 8, 1, 4};
        System.out.println(
                "Test Case 4 -> " + solution.maxProfit(prices4)
        ); // Expected: 6
    }

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minNumberFound = prices[0];

        for (int i = 1; i < prices.length; i++) {
            minNumberFound = Math.min(minNumberFound, prices[i]);
            maxProfit = Math.max(maxProfit, (prices[i] - minNumberFound));
        }

        return maxProfit;
    }
}