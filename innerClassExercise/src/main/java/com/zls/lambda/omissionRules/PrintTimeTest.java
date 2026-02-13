package com.zls.lambda.omissionRules;

public class PrintTimeTest {

    public static void main(String[] args) {
        PrintTime p = () -> System.out.println(System.currentTimeMillis());
        p.printTime();
    }
}
