package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String fur = hasFur ? "a" : "no";
        String paws = numberOfPaws == 1 ? numberOfPaws + " paw" : numberOfPaws + " paws";
        return "This animal is mostly "
                + color + ". It has " + paws + " and " + fur
                + " fur.";
    }

    public static void main(String[] args) {
        System.out.println(new Animal("blue", 1213, false).getDescription());
    }
}
