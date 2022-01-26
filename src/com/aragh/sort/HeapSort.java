package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HeapSort {

    //programiz.com/dsa/heap-sort
    public static void main(String[] args) {
        int[] arr = {1, 12, 9, 5, 6, 10};
        int n = arr.length;
        for (int i = n/2 -1; i>=0; i-- ) {
            heapify(arr, i, n);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Heapify root element
            heapify(arr, 0, i);
        }
        printElements(arr);
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }

    private static void heapify(int[] arr, int currentIndex, int size) {
       int largest = currentIndex;
       int left = currentIndex*2 +1;
       int right = currentIndex*2 + 2;

       if (left < size && arr[left] > arr[largest]) {
           largest = left;
       }
       if (right < size && arr[right] > arr[largest]) {
            largest = right;
       }

       if (largest != currentIndex) {
           swap(arr, currentIndex, largest);
           heapify(arr, largest, size);
       }
    }

    private static void swap(int[] arr, int i, int largest) {
        int temp = arr[i];
        arr[i] = arr[largest];
        arr[largest] = temp;
    }
}
