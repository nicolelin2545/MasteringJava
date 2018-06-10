package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int number;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a number from 1-3");
        number = myScanner.nextInt();

        if (number==1){
            System.out.println("Hello ");
        }else if (number==2){
            System.out.println("Hello, hello");
        }else if (number==3){
            System.out.println("Hello, hello, hello");
        }
    }
}
