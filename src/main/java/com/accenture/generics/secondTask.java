package com.accenture.generics;

public class secondTask <T,U>{

    public T telement;
    public U uelement;

    public static void main(String[] args) {
        secondTask<Character, String> pair = new secondTask<Character, String>();
        pair.setTelement('c');
        pair.setUelement("cc");
        System.out.println(pair.getTelement());
        System.out.println(pair.getUelement());
    }


    public T getTelement() {
        return telement;
    }

    public U getUelement() {
        return uelement;
    }

    public void setTelement(T telement) {
        this.telement = telement;
    }

    public void setUelement(U uelement) {
        this.uelement = uelement;
    }
}
