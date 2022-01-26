package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveInsertionSort {

    /**
     * O(n*n)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {64 ,25, 12, 22, 11};
        insertionSort(arr, 0);
    }


    private static void insertionSort(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        int j = index -1;
        int key = arr[index];
        /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
        while (j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j + 1] = key;
        printElements(arr);
        insertionSort(arr, index+1);
    }
    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }
}
