package com.zls.lambda.exercise;

public class PrintableTest {

    public static void main(String[] args) {
//        Printable p = new Printable() {
//            @Override
//            public void print(Object o) {
//                System.out.println(o);
//            }
//        };

        Printable p = (Object o) -> {
            System.out.println(o);
        };
        p.print("这是一个字符串");
    }
}
