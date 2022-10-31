package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("red", 2, true);
        Animal bird = new Bird();
        Animal dog = new Dog();
        System.out.println("animal getDescription: " + animal.getDescription());
        System.out.println("bird getDescription: " + bird.getDescription());
        System.out.println("dog getDescription: " + dog.getDescription());
    }
}
