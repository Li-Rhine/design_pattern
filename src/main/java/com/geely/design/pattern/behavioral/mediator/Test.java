package com.geely.design.pattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom = new User("Tom");

        geely.sendMessage("Hey! Tom! Let's learn");
        tom.sendMessage("OK! Geely");
    }
}
