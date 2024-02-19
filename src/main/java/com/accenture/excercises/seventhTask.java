package com.accenture.excercises;

public class seventhTask {
    public static int balance = 100;

    public static void main(String[] args) throws InsufficientBalanceException {
        int withdrawal1 = 80;
        int withdrawal2 = 19;
        int withdrawal3 = 5;
        checkBalance(withdrawal1);
        checkBalance(withdrawal2);
        checkBalance(withdrawal3);
    }

    public static void checkBalance(Integer withdrawal) throws InsufficientBalanceException {
        if (balance - withdrawal < 0) {
            throw new InsufficientBalanceException("Not enough balance, " + Math.abs(balance-withdrawal) + " EUR too less");
        } else {
            balance -= withdrawal;
            System.out.println("Withdrawal of "+withdrawal+" EUR was successful, new balance is " + balance + " EUR");
        }
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String s) {
        super(s);
    }
}


