package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num1;
	int num2;
	Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first number ");
        num1 = myScanner.nextInt();
        System.out.println("Enter your second number");
        num2 = myScanner.nextInt();
        int num3 = num1 + num2;
        System.out.println("Your total sum is " + num3);

    }
}
