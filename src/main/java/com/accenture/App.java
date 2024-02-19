package com.accenture;

import com.accenture.comaparator.AnimalNameComparator;
import com.accenture.command.AddCommand;
import com.accenture.command.Command;
import com.accenture.command.ExitCommand;
import com.accenture.command.ShowCommand;

import java.time.LocalDateTime;
import java.util.*;

public class App {
    /*
    public static void main(String[] args) {
        AnimalShelter animalshelter = new AnimalShelter();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("What do you want? add, show or exit?");
            String input = scanner.nextLine();
            if (input.equals("add")) {
                System.out.println("Enter animal name");
                String animalName = scanner.nextLine();
                System.out.println("Enter animal species");
                String animalSpecies = scanner.nextLine();
                animalshelter.addAnimal(animalName, animalSpecies);
            } else if (input.equals("show")) {
                animalshelter.showAnimals();
            } else if (input.equals("exit")) {
                System.out.println("Exiting program...");
                System.exit(0);
            } else {
                System.out.println("invalid input, try again");
            }
        }
    } */
    public static void main(String[] args) {
        App app = new App();
        //app.run();
        app.runTree();
    }

    public void runTree() {
        //LocalDateTime dt = LocalDateTime.now();
        LocalDateTime dt = LocalDateTime.of(2024,01, 15, 14,15);
        Animal a = new Animal("albert","storch", dt);
        Animal b = new Animal("einstein","rabe", dt.plusHours(1));
        Animal c = new Animal("cleo","delfin", dt.plusHours(2));

        Set<Animal> animaltree = new TreeSet<Animal>(new AnimalNameComparator());
        animaltree.add(a);
        animaltree.add(b);
        animaltree.add(c);

        System.out.println(animaltree);


    }

    public void run() {
        final Scanner scanner = new Scanner(System.in);

        final List<Animal> animals = new ArrayList<>();

        final Command exitCommand = new ExitCommand();
        final Command addCommand = new AddCommand(animals, scanner);
        final Command showCommand = new ShowCommand(animals);

        final List<Command> commands = List.of(exitCommand, addCommand, showCommand);

        System.out.println("Welcome to the animal shelter.");

        while(true) {
            System.out.println("Type a command.");
            final String userCommand = scanner.nextLine();
            System.out.println("You wrote user command: " + userCommand);
            for(Command command : commands) {
                if(command.shouldRun(userCommand)){
                    command.execute();
                }
            }
        }

    }
}
