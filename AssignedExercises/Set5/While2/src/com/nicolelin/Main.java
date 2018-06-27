package com.nicolelin;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {

        double x=0;
        double number = Math.random();
        Scanner myScanner = new Scanner (System.in);

        System.out.println("Enter number between 0.05 and 0.99");
        number = myScanner.nextDouble();

        while (x!=number){
            System.out.println("Re enter number");
            number = myScanner.nextDouble();
        }
        System.out.println("You guessed the right number");



    }

}
