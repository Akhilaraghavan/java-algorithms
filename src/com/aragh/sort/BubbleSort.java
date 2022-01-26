package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BubbleSort {

    /**
     * worst case O(n*n)
     * best cased sorted O(n)
     *
     * Bubble sort sorts the element in each iteration, such that the maximum element in the
     * list is the pushed to end of the list.
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {64 ,25, 12, 22, 11};
        boolean swapped;
        for (int i =0; i<arr.length -1; i++) {
            swapped = false;
            //The last element after each iteration is the max element, so the j < arr.length -i -1
            for (int j =0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                printElements(arr);
            }
            if (!swapped)
                break;
        }
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> ""+i).collect(Collectors.joining(",")));
    }
}
