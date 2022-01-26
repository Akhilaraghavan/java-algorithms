package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class QuickSort {

    /**
     * Worst case when smallest or largest is considered as pivot
     * O(n*n)
     * Average O(nlogn)
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quicksort(arr, 0, arr.length-1);
        printElements(arr);
    }

    private static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int partition = partition(arr, low,  high);
            quicksort(arr, low, partition -1);
            quicksort(arr, partition+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low -1;

        for (int j = low; j<= high -1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        printElements(arr);
        swap(arr, i+1, high);
        printElements(arr);
        return i+1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }
}
