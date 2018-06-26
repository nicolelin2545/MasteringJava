package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int counter = 0;
	    int number = 0;

        System.out.println("Enter number");
        number = myScanner.nextInt();
        int sum = number;


        while (number!=0){
            System.out.println("Re enter number");
            number = myScanner.nextInt();
            sum = sum + number;
            counter = counter + 1;
        }
        System.out.println("Number of loops is " + counter);
        System.out.println("Your average is "+sum/counter);
    }
}
