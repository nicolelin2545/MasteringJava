package com.nicolelin;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int number = (int) (Math.random()*(10-1)+1);
        System.out.println("Enter a number between one and ten");
        int input = myScanner.nextInt();

        while (input!=number){
            System.out.println("Re enter number");
            input = myScanner.nextInt();
        }
        System.out.println("You guessed the number");
    }
}
