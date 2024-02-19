package com.accenture.excercises;

public class sixthTask {
    // suppose theater has 100 seats
    public static boolean[] seats = new boolean[100];

    public static void main(String[] args) throws SeatNotAvailableException {
        // testing seat numbers
        checkSeat(9);
        checkSeat(99);
        checkSeat(9);
    }

    public static void checkSeat(Integer seatnumber) throws SeatNotAvailableException {
        // seat is free if no entry in array, else already taken
        if (!seats[seatnumber]) {
            seats[seatnumber] = true;
            System.out.println("Seat " + seatnumber + " was free and is filled now.");
        } else {
            throw new SeatNotAvailableException("Seat "+seatnumber+" not is available anymore.");
        }
    }
}

class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String s) {
        super(s);
    }
}
