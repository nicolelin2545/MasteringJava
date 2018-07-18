package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int input;
	    int answer=1;
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a number ");
        input = myScanner.nextInt();
        

        

        while (input!=0){
            answer =answer*input;
            input=input-1;


        }
        System.out.println(answer);



    }
}
