package com.nicolelin;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {

        int number = (int) (Math.random()*(10-1)+1);
        Scanner myScanner = new Scanner (System.in);

        System.out.println("Enter number between 1 and ten ");
        int x = myScanner.nextInt();

        while (x!=number){
            System.out.println("Re enter number");
            x = myScanner.nextInt();
        }
        System.out.println("You guessed the right number");



    }

}
