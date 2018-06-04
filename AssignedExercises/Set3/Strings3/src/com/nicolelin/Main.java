package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String sentence1;
	    String sentence2;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter first sentence");
        sentence1 = myScanner.nextLine();

        System.out.println("Enter second sentence");
        sentence2 = myScanner.nextLine();



        System.out.println(sentence1.compareTo(sentence2));
    }
}

