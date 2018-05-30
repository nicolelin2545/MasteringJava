package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int A;
	    int B;
	    int C;
	    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your A value");
        A = myScanner.nextInt();
        System.out.println("Enter your B value");
        B = myScanner.nextInt();
        System.out.println("Enter your C value");
        C = myScanner.nextInt();
        double quadratic = B*B-4 * A * C;

        if (quadratic<0){
            System.out.println("You have 0 roots");
        } else if (quadratic == 0){
            System.out.println("You have 1 root");
        }else if (quadratic>0){
            System.out.println("You have 2 roots");
        }
    }
}
