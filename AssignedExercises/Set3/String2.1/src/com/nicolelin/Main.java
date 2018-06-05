package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String sentence;
	    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your sentence");
        sentence = myScanner.nextLine();
        String letter1 = sentence.substring(0,1).toUpperCase();
        String restletter = sentence.substring (1,sentence.length()).toLowerCase();
        System.out.println(letter1 + restletter);

    }
}
