package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner(System.in);
	    int age;
        System.out.println("Enter your age ");
        age = myScanner.nextInt();
        if (age >= 65) {
            System.out.println("You are a senior citizen");
        }

    }
}
