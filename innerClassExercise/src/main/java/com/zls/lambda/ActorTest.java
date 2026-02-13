package com.zls.lambda;

public class ActorTest {

    public static void main(String[] args) {

        Actor actor = () -> {
            System.out.println("演员表演");
        };
        actor.performance();
    }
}
