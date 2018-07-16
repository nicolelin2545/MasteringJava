package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int number;
	    int input;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a number from 1-4");
        number = myScanner.nextInt();
        

        while (number!=4&&number!=3&&number!=2&&number!=1){
            System.out.println("Enter your number ");
            number = myScanner.nextInt();
        }
        System.out.println(4*3*2*1);



    }
}
