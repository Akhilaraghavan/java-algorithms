package com.aragh.search;

public class BinarySearch {

    //Sorted array  complexity - T(n/2) + c
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 90;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }

    private static int binarySearch(int[] arr, int left, int right, int element) {
        if (right >= left) {
            int mid = left + (right-left)/2;
            if (arr[mid] == element) {
                return mid;
            }

            if (arr[mid] > element) {
                return binarySearch(arr, left, mid-1, element);
            }
            return binarySearch(arr, mid+1, right, element);
        }

        return -1;
    }
}
