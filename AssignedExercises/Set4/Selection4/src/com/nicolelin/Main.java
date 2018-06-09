package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int number1;
	    int number2;
        System.out.println("Enter your number");
        number1 = myScanner.nextInt();
        System.out.println("Enter your number");
        number2 = myScanner.nextInt();

        if (number1==number2){
            System.out.println("You win!");
        }else {
            System.out.println("Game over");
        }


    }
}
