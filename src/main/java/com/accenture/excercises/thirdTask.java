package com.accenture.excercises;

import java.util.ArrayList;
import java.util.HashMap;

public class thirdTask {

    public static ArrayList<String> candidates = new ArrayList<>();

    public static void main(String[] args) {
        candidates.add("Paul");
        candidates.add("Arian");
        candidates.add("Arian");
        candidates.add("Arian");
        candidates.add("Arian");
        candidates.add("Paul");
        HashMap<String, Integer> counted = countCandidates(candidates);
        System.out.println(counted);

    }

    public static HashMap<String, Integer> countCandidates(ArrayList<String> candidates){
        HashMap<String, Integer> counted = new HashMap<String, Integer>();
        for (String s: candidates) {
            if (!counted.containsKey(s)) {
                counted.put(s,1);
            } else {
                counted.put(s, counted.get(s)+1);
            }
        }
        return counted;
    }



}
