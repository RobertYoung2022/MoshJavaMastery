package com.bobbyworld;

import java.util.Arrays;

public class ArraysMosh {
    public static void main(String[] args) {
        // TODO: old method of initializing an array
        // TODO: All Arrays have a fixed length
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        System.out.println(Arrays.toString(numbers));

        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length); // printed out the length of the numbers array
        Arrays.sort(numbers); //This step was the sorting of the numbers array
        System.out.println(Arrays.toString(numbers)); // printing out a new array of sorted numbers from the array
    }
}
