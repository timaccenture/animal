package com.accenture.excercises;

public class fifthTask {
    public static void main(String[] args) {
        String str = "10";
        int number = StringtoInt(str);
        if (number < 0) {
            throw new IllegalArgumentException("Number should be non-negative");
        } else {
            System.out.println(number);
        }
    }
    public static int StringtoInt(String s) {
        int i = 0;
        try {
            i = Integer.parseInt(s);
            return i;
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println("Invalid number");
            return i;
        } finally {
            System.out.println("Closing resources");
        }

    }
}
