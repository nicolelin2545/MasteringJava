package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int input;


        do {
            System.out.println("Guess a number between 1 and 5");
            input = myScanner.nextInt();
        } while (input!=5);

        System.out.println("1");
        System.out.println("2 2 ");
        System.out.println("3 3 3 ");
        System.out.println("4 4 4 4 ");
        System.out.println("5 5 5 5 5 ");

        System.out.println("Guess a number between 1 and 5");
        input = myScanner.nextInt();

        while (input!=4){
        }
        System.out.println("1");
        System.out.println("2 2");
        System.out.println("3 3 3 ");
        System.out.println("4 4 4 4 ");

        System.out.println("Guess a number between 1 and 5");
        input = myScanner.nextInt();

        while (input!=3){
        }
        System.out.println("1");
        System.out.println("2 2");
        System.out.println("3 3 3 ");

        System.out.println("Guess a number between 1 and 5");
        input = myScanner.nextInt();

        while (input!=2){
        }
        System.out.println("1");
        System.out.println("2 2");

        System.out.println("Guess a number between 1 and 5");
        input = myScanner.nextInt();

        while (input!=1){
        }
        System.out.println("1");









    }
}
