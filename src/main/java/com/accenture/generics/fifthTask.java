package com.accenture.generics;

import java.util.ArrayList;
import java.util.List;

public class fifthTask {

    static List<? super Number> copyAll(List<? extends Number> list) {
        List<? super Number> copy = new ArrayList<>();
        for (Number l: list) {
            copy.add(l);
        }
        return copy;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10000);
        System.out.println(fifthTask.copyAll(list));

    }
}
