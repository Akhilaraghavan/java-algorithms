package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSortRecursive {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr, arr.length);
    }

    private static void bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int j = 0; j <n-1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        printElements(arr);
        bubbleSort(arr, n-1);
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> "" + i).collect(Collectors.joining(",")));
    }
}