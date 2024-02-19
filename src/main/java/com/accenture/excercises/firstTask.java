package com.accenture.excercises;

import java.util.HashMap;

public class firstTask {
    public static void main(String[] args) {
        String str = "dies ist ein test ein test den test ist";
        countWords(str);
    }

    public static void countWords(String str) {
        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        String[] arrOfStr = str.split(" ");

        for (String s: arrOfStr) {
            if (!wordCounter.containsKey(s)) {
                wordCounter.put(s,1);
            } else {
                wordCounter.put(s,wordCounter.get(s)+1);
            }
        }
        System.out.println(wordCounter);
    }
}
