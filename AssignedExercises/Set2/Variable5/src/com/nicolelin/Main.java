package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num1;
	int num2;
	Scanner myScanner = new Scanner(System.in);
        System.out.println("Note : Make sure your first number is bigger than your second number!");
        System.out.println("Enter your first number ");
        num1 = myScanner.nextInt();
        System.out.println("Enter your second number ");
        num2 = myScanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1/num2;
        int remainder = num1%num2;
        System.out.println("Your sum is " + sum);
        System.out.println("Your difference is " + difference);
        System.out.println("Your product is " + product);
        System.out.println("Your quotient " + quotient );
        System.out.println("Your remainder is " + remainder);




    }
}
