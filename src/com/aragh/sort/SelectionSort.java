package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelectionSort {

    /**
     * Sorts an array repeatedly finding the minimum element
     * complexity is O(n*n)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {64 ,25, 12, 22, 11};
        for (int i = 0; i<arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j<arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int minElement = arr[min];
            while (min > i) {
                arr[min] = arr[min -1];
                min--;
            }
            arr[i] = minElement;
            printElements(arr);
        }
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }
}
