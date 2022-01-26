package com.aragh.search;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        for (int i =0; i< arr.length; i++) {
            if (arr[i] ==x) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
