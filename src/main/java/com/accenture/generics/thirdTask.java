package com.accenture.generics;

import java.util.Arrays;

public class thirdTask<T> {


    public static <T extends Comparable<T>> T[] sorting(T[] sorting) {
        Arrays.sort(sorting);
        return sorting;
    }

    public static void main(String[] args) {
        Integer[] tmp = new Integer[3];
        tmp[0] = 1;
        tmp[1] = 5;
        tmp[2] = 2;
        thirdTask.sorting(tmp);
        for(Integer t: tmp) {
            System.out.println(t);
        }

        String[] tmpstr = new String[2];
        tmpstr[0] = "hallo";
        tmpstr[1] = "berta";
        thirdTask.sorting(tmpstr);
        for (String s: tmpstr) {
            System.out.println(s);
        }
    }
}
