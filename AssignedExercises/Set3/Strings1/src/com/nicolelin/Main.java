package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String sentence;
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Insert a sentence");
        sentence = myScanner.nextLine();
        int number = sentence.length();
        System.out.println(number);



    }


}
