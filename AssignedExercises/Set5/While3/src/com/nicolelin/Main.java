package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner myScanner = new Scanner (System.in);
	int number = 0;
	String input = "";

	while (!input.equals(number)){
        System.out.println("Re enter number");
        input = myScanner.nextLine();
    }
    }
}
