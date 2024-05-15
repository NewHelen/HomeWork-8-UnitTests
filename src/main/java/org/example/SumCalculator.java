package org.example;

public class SumCalculator {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        if (sum < 1) {
            throw new IllegalArgumentException("n має бути не менше 0");
        }
        return sum;
    }
}