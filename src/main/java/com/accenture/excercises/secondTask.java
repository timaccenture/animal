package com.accenture.excercises;

import java.util.ArrayList;
import java.util.HashMap;

import java.time.LocalDate;

public class secondTask {
    public static HashMap<String,LocalDate> bdays = new HashMap<String,LocalDate>();

    public static void main(String[] args) {
        addBday("Paul", LocalDate.of(2000,1,5));
        addBday("Arian", LocalDate.of(1999, 5,19));
        update("Arian",LocalDate.of(1999, 5,22));
        remove("Paul");
        System.out.println(bdays);
    }

    public static void addBday(String name, LocalDate date) {
        bdays.put(name, date);
        System.out.println(name + "'s birthday at the " + date + " added");
    }

    public static void update(String name, LocalDate date) {
        if (bdays.containsKey(name)) {
            bdays.put(name, date);
        }
        System.out.println(name + "'s birthday updated with the new date " + date);
    }

    public static void remove(String name) {
        bdays.remove(name);
        System.out.println(name + "'s birthday removed");
    }
}
