package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int a;
	    int b;
	    Scanner myScanner= new Scanner (System.in);
        System.out.println("Enter a number you want to start at");
        a=myScanner.nextInt();
        System.out.println("Enter your number you want to end at");
        b=myScanner.nextInt();

        for (int i=a;i<b+1;i++){
            System.out.println(i);
        }
    }
}
