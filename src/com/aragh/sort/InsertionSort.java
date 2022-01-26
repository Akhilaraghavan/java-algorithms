package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertionSort {

    /**
     * O(n*n)
     *
     * Insertion sort, keeps moves elements to the right of the list which are greater than the key
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {64 ,25, 12, 22, 11};
        for (int i =1; i<arr.length; i++) {
            int key = arr[i];
            int j = i -1;

            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = key;
            printElements(arr);
        }
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }
}
