package com.zls.lambda.exercise2;

public class CalculateTest {

    public static void main(String[] args) {
        Calculate c = (int a, int b) -> {
            return a + b;
        };
        int result = c.sum(1,5);
        System.out.println(result);
    }
}
