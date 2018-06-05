package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String sentence;
        String sentence2;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first sentence");
        sentence = myScanner.nextLine();
        System.out.println(sentence.length());
        System.out.println("Enter second sentence");
        sentence2 = myScanner.nextLine();
        System.out.println(sentence2.length());

        if (sentence == sentence2){
            System.out.println("0");
        }else if (sentence == sentence2) {
            System.out.println("Negative/positive");
        }

    }
}
