package com.epam.mjc.stage0;

public class Dog extends Animal {

    public Dog() {
        super("brown", 4, true);
    }

    public static void main(String[] args) {
        System.out.println(new Dog().getDescription());
    }
}
