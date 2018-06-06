package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a sentence with five words only");
        String sentence = myScanner.nextLine();

        int space1 = sentence.indexOf(" ");
        String word1 = sentence.substring(0,space1);
        sentence = sentence.substring(space1+1);

        int space2 = sentence.indexOf(" ");
        String word2 = sentence.substring(0,space2);
        sentence = sentence.substring(space2+1);

        int space3 = sentence.indexOf(" ");
        String word3 = sentence.substring(0,space3);
        sentence = sentence.substring(space3+1);

        int space4 = sentence.indexOf(" ");
        String word4 = sentence.substring(0,space4);
        sentence = sentence.substring(space4+1);



        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(sentence);


    }
}
