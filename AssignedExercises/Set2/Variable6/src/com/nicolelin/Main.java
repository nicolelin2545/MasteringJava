package com.nicolelin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int length;
	    int width;
	    Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your length");
        length = myScanner.nextInt();
        System.out.println("Enter your width");
        width = myScanner.nextInt();
        int area = length * width;
        int perimeter = length + length + width + width;
        System.out.println("Your area is " + area + " and your perimeter is " + perimeter);

    }
}
