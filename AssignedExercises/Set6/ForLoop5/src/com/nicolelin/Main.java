package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a word");
        String word = myScanner.nextLine();
        System.out.println("Enter how many times you want to print the word (a number)");
        int num = myScanner.nextInt();


        for (int i=0;i<num;i++){
            System.out.println(word);
        }

    }
}
