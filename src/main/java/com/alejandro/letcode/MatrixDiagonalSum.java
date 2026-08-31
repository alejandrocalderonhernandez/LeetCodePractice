package com.alejandro.letcode;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int diagonal1 = 0;
        int diagonal2 = mat.length - 1;

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mat.length; i++) {

            if (diagonal1 == diagonal2 ) {
                System.out.println("Centro [" + mat[i][diagonal1] + "]");
                sum1 -= mat[i][diagonal1];
            }
            sum1 += mat[i][diagonal1];
            sum2 += mat[i][diagonal2];

            diagonal1 ++;
            diagonal2 --;
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {

        MatrixDiagonalSum solution = new MatrixDiagonalSum();

        // Test Case 1 - Simple
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       System.out.println(
             "Test Case 1 -> " + solution.diagonalSum(mat1));
        // Expected: 25


        // Test Case 2 - Medium
        int[][] mat2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };

        System.out.println(
                "Test Case 2 -> " + solution.diagonalSum(mat2)
        ); // Expected: 8


        // Test Case 3 - Hard
        int[][] mat3 = {
                {7, 2, 9, 4, 6},
                {3, 8, 1, 5, 2},
                {6, 4, 7, 3, 9},
                {2, 5, 8, 1, 4},
                {9, 3, 6, 7, 8}
        };

        System.out.println(
                "Test Case 3 -> " + solution.diagonalSum(mat3)
        ); // Expected: 49


    }


}