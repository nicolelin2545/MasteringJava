package com.nicolelin;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        int a;
        int b;

        do {
            int a = (int) (Math.random() * (100 - 1) + 1);
            int b = (int) (Math.random() * (100 - 1) + 1);
            System.out.println(a+b);
            System.out.println(a*b);
        } while (a + b != 20 && a * b != 96);
        System.out.println("The two numbers are "+a + "and " +b) ;

    }
}
