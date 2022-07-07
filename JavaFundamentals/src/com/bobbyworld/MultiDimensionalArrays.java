package com.bobbyworld;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3]; // This will create 2 rows with 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers)); // deepToString() is used for multidimensional Arrays

        // Alternate way to create a multidimensional array
        int[][] numbers2 = {{1, 2, 3,}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2));
    }
}
