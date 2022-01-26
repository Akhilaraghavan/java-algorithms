package com.aragh;

public class SumDigits {
    //12345 -> 15
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    private static int sum(int n) {
        int sum = 0;
        if (n <= 9) {
            return n;
        }
        while (n >0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }


}
