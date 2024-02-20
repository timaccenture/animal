package com.accenture.generics;

import java.util.ArrayList;
import java.util.List;

public class firstTask <T>{

    private List<T> stack = new ArrayList<T>();

    public static void main(String[] args) {
        firstTask<Integer> tmp = new firstTask<Integer>();
        tmp.push(1);
        System.out.println(tmp.peek());
        tmp.push(2);
        System.out.println(tmp.peek());
        tmp.pop();
        System.out.println(tmp.peek());
    }

    void push(T t){
        stack.add(t);
    }

    void pop() {
        stack.removeLast();
    }

    T peek() {
        return stack.get(stack.size()-1);
    }


}
