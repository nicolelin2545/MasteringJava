package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
	    String sentence1;
        System.out.println("enter sentence consisting of 5 words only");
        sentence1 = myScanner.nextLine();

        int space1 = sentence1.indexOf(" ");
        String word1 = sentence1.substring(0,space1);
        String sentence2 = sentence1.substring(space1+1);

        int space2 = sentence2.indexOf(" ");
        String word2 = sentence2.substring(0,space2);
        String sentence3 = sentence2.substring(space2+1);

        int space3 = sentence3.indexOf(" ");
        String word3 = sentence3.substring(0,space3);
        String sentence4 = sentence3.substring(space3+1);

        int space4 = sentence4.indexOf(" ");
        String word4 = sentence4.substring(0,space4);
        String sentence5 = sentence4.substring(space4+1);

        String word5 = sentence5;

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);



    }
}

