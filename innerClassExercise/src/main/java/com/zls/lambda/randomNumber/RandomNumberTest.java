package com.zls.lambda.randomNumber;

import java.util.Random;

public class RandomNumberTest {

    public static void main(String[] args) {
//        RandomNumber r1 = new RandomNumber() {
//            @Override
//            public int getRandomNumber(int start, int end) {
//                return 0;
//            }
//        };
//
//        RandomNumber r2 = (int start, int end) -> {
//            return (int)(Math.random() * (end - start)) + start;
//        };
//
//        RandomNumber r3 = (start, end) -> {
//            return (int)(Math.random() * (end - start)) + start;
//        };

        RandomNumber r = (start, end) -> (int)(Math.random() * (end - start)) + start;
        System.out.println(r.getRandomNumber(10, 20));

        RandomNumber r1 = (start, end) -> new Random().nextInt(end - start) + start;
        System.out.println(r1.getRandomNumber(10, 20));
    }
}
