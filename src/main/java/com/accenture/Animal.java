package com.accenture;

import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.time.LocalDateTime;

public class Animal implements Comparable<Animal>{
    private final String name;
    private final String species;

    private final LocalDateTime joinedDateTime;

    public Animal(String name, String species, LocalDateTime joinedDateTime) {
        this.name = name;
        this.species = species;
        this.joinedDateTime = joinedDateTime;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDateTime getJoinedDateTime() {
        return joinedDateTime;
    }

    public void makeSound() {
    }


    @Override
    public boolean equals(Object o) {
        // comparison with address in heap
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }

        Animal animal = (Animal) o;
        return this.name.equals(animal.name) && this.species.equals(animal.species);
    }

    @Override
    public int hashCode() {
        return 11 * name.hashCode() + 13 * species.hashCode();
    }

    @Override
    public String toString() {
        DateTimeFormatter joinedDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //return "Animals has name " + name + " and is of species " +species;
        return "The animal " + species + " with name "
                + name + " was added at "
                + joinedDateTime.format(joinedDateTimeFormatter);
    }
    @Override
    public int compareTo(Animal a){
        return this.name.compareTo(a.name);
    }
}
