package com.revature.main;

import com.revature.util.MyStack;

public class Driver {

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.addElement(1);
        stack.addElement(3);
        stack.addElement(6);

        System.out.println(stack);

        stack.removeElement();

        System.out.println(stack);

        System.out.println(stack.minValue());

    }
}
