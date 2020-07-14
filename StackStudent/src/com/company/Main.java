package com.company;

import java.util.Stack;

public class Main {

    public Main() {
        Stack stack = new Stack();
        Student milos = new Student(1650, "Milos", "Petrovic");
        Student petar = new Student(1630, "Petar", "Mirkovic");
        stack.push(milos);
        stack.push(petar);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        try {
            System.out.println(stack.pop());
        } catch (java.util.EmptyStackException e) {
            stack.push(milos);
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
        // write your code here
        new Main();

    }
}
