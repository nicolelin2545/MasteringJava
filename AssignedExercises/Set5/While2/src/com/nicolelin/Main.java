package com.nicolelin;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {

        int x=0;
        int number = (int) (Math.random()*(10-1)+1);
        Scanner myScanner = new Scanner (System.in);

        System.out.println("Enter number between 1 and ten ");
        number = myScanner.nextInt();

        while (x!=number){
            System.out.println("Re enter number");
            number = myScanner.nextInt();
        }
        System.out.println("You guessed the right number");



    }

}
