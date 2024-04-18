package org.example;

public class SumCalculator {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }

        if (sum < 1) {
            throw new IllegalArgumentException("n має бути не менше 0");
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            System.out.println(sum(3));
            System.out.println(sum(1));
            System.out.println(sum(0));
        }catch (IllegalArgumentException e){
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}