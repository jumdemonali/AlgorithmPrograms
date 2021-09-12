package com.bl.algo;

public class PrimeNumber {

    public static void main(String[] args) {
        int n1 = 0, n2 = 1000;
        primeNumbers(n1, n2);
    }

    private static void primeNumbers(int a, int b) {
        int flag;
        System.out.println("Prime numbers are:");
        for (int i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }
    }
}