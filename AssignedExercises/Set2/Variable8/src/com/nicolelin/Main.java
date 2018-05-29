package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double principal;
	double rate;
	int time;
	Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your principle");
        principal = myScanner.nextDouble();
        System.out.println("Enter your rate in decimals ");
        rate = myScanner.nextDouble();
        System.out.println("Enter your time ");
        time = myScanner.nextInt();

        double total = principal * rate * time;
        System.out.println("Your interest is " + total);

    }
}
