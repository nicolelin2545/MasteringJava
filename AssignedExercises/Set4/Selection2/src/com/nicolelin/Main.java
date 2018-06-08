package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner newScanner = new Scanner(System.in);
	    int mark;
        System.out.println("Enter your mark");
        mark = newScanner.nextInt();

        if (mark>=50){
            System.out.println("You passed!");
        }else{
            System.out.println("Better luck next time");
        }


    }
}
