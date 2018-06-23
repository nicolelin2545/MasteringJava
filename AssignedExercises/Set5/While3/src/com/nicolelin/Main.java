package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int counter = 0;
	    int number;
        System.out.println("enter number");
        number = myScanner.nextInt();
        int sum = 0;

	    while (number!=0){
	        sum = sum + number;
            System.out.println("enter number");
            number = myScanner.nextInt();
            counter = counter + 1;
        }
        System.out.println("averge is: " + sum/counter);
        System.out.println("number of loops is: " + counter);
    }
}
