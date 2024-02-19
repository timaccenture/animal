package com.accenture.comaparator;

import com.accenture.Animal;

import java.util.Comparator;

public class AnimalNameComparator implements Comparator<Animal> {

    public int compare(Animal ani1, Animal ani2) {
        return ani1.getName().compareTo(ani2.getName());
    }

}
