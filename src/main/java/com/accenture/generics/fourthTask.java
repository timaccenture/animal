package com.accenture.generics;

import java.util.ArrayList;
import java.util.List;

public class fourthTask {

    static <T> void printList(List<T> toPrint) {
        for (T l: toPrint) {
            System.out.println(l);
        }
    }

    public static void main(String[] args) {
        List<String> tmplist = new ArrayList<String>();
        tmplist.add("hi");
        tmplist.add("sören");
        System.out.println(tmplist);
        fourthTask.printList(tmplist);
    }
}
