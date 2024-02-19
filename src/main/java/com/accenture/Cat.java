package com.accenture;

import java.time.LocalDateTime;

public class Cat extends Animal{

    public Cat (String name, LocalDateTime joinedDateTime) {
        super(name, "cat", joinedDateTime);
    }

    @Override
    public void makeSound() {
        System.out.println("miau");
    }
}
