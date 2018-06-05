package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String sentence;
        String sentence2;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first sentence");
        sentence = myScanner.nextLine();
        System.out.println("Enter second sentence");
        sentence2 = myScanner.nextLine();


        int number = sentence.compareTo(sentence2);
        System.out.println(number);


    }
}
