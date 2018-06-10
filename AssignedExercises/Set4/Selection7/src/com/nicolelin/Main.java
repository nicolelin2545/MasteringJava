package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int mark1;
	    int mark2;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a mark between 0-100");
	    mark1 = myScanner.nextInt();
        System.out.println("Enter a mark between 0-100");
        mark2 = myScanner.nextInt();

        if (mark1>mark2){
            System.out.println(mark1);
        }else if (mark2>mark1){
            System.out.println(mark2);
        }


    }
}
