package com.zls.lambda;

public class Test {
    public static void main(String[] args) {
        Actor actor = new Actor() {
            @Override
            public void performance() {
                System.out.println("演员表演节目");
            }
        };
        actor.performance();
    }
}
