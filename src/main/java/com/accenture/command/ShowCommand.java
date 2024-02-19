package com.accenture.command;

import com.accenture.Animal;

import java.util.List;

import java.time.format.DateTimeFormatter;

public class ShowCommand implements Command {

    public final List<Animal> animals;

    public final DateTimeFormatter joinedDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public ShowCommand(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public void execute() {
        System.out.println("Showing list of all animals in the shelter");
        for (Animal a: animals) {
            System.out.println("The animal " + a.getSpecies() + " with name "
                    + a.getName() + " was added at "
                    + a.getJoinedDateTime().format(joinedDateTimeFormatter));
        }
    }

    @Override
    public boolean shouldRun(String command) {
        return "show".equals(command);
    }
}
