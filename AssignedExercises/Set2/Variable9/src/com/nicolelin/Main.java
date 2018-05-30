package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int first;
	    int second;
	    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first number ");
        first = myScanner.nextInt();
        System.out.println("Enter your second number");
        second = myScanner.nextInt();
        //int third = first / second;
        System.out.println("Your quotient is " + first/second);
    }
}
