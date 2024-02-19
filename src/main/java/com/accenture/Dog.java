package com.accenture;

import java.time.LocalDateTime;

public class Dog extends Animal{

    public Dog(String name, LocalDateTime joinedDateTime) {
        super(name, "dog", joinedDateTime);
    }

    @Override
    public void makeSound() {
        System.out.println("Wuff");
    }
}
