package com.accenture;

import java.util.*;
import java.time.LocalDateTime;


public class AnimalShelter {
    private List<Animal> animals;

    public AnimalShelter() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(String name, String species, LocalDateTime joinedDateTime) {
        Animal animal = new Animal(name, species, joinedDateTime);
        animals.add(animal);
    }

    public void showAnimals(){
        System.out.println("Showing list of all animals in the shelter");
        for (Animal a: animals) {
            System.out.println(a.getName() + " " +a.getSpecies());
        }
    }
}
