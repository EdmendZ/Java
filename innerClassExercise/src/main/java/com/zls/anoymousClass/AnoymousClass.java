package com.zls.anoymousClass;

public class AnoymousClass {

    public static void main(String[] args) {

        int result = calculate(10, 20);
        System.out.println(result);

        Animal a = new Animal() {
            public void eat(){
                System.out.println("tiger eat meat");
            }
        };
        a.eat();
    }

    public static int calculate(int a, int b){
        Calculate c = new Calculate() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        return c.calculate(a,b);
    }
}
