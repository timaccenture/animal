package com.accenture.command;

import com.accenture.Animal;

import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class AddCommand implements Command {

    private final List<Animal> animals;
    private final Scanner scanner;

    public AddCommand(List<Animal> animals, Scanner scanner) {
        this.animals = animals;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.println("add animal species");
        String species = scanner.nextLine();

        System.out.println("add animal name");
        String name = scanner.nextLine();

        LocalDateTime joinedDateTime = LocalDateTime.now();

        Animal animal = new Animal(name, species, joinedDateTime);
        animals.add(animal);
    }

    @Override
    public boolean shouldRun(String command) {
        return "add".equals(command);
    }
}
