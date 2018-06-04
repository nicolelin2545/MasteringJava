package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    String sentence;
	    Scanner myScanner = new Scanner(System.in);
        System.out.println("Insert sentence");
        sentence = myScanner.nextLine();

        String firstLetter = sentence.substring(0,1).toUpperCase();
        String restLetters = sentence.substring(1,sentence.length()).toLowerCase();

        System.out.println(firstLetter + restLetters);


    }
}
