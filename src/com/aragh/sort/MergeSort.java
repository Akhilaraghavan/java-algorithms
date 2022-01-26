package com.aragh.sort;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38,27,43,3,9,82,10};
        mergeSort(arr, 0, arr.length-1);
        printElements(arr);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int first = mid - left + 1;
        int second = right - mid;

        int[] leftArr = new int[first];
        int[] rightArr = new int[second];

        System.arraycopy(arr, left, leftArr, 0, first);
        System.arraycopy(arr, mid+1, rightArr, 0, second);
      /*  for (int i = 0; i < first; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int i = 0; i < second; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }
*/
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = left;
        while (i < first && j < second) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < first) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < second) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private static void printElements(int[] arr) {
        System.out.println(IntStream.of(arr).mapToObj(i -> "" + i).collect(Collectors.joining(",")));
    }
}
