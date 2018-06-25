package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int counter = 0;
	    int number = 0;
	    int sum = 0;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter number");
        number = myScanner.nextInt();

        while (number!=0){
            System.out.println("Re enter number");
            number = myScanner.nextInt();
            sum = sum + number;
            counter = counter+1;
        }
        System.out.println("Your average is " +counter/sum);
        System.out.println("Number of attempts is " +counter);
    }
}
