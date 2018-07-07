package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
        String password = "luby";
        String input = " ";

        do{
            System.out.println("Enter password ");
            input = myScanner.nextLine();
        } while (!input.equals(password));
        System.out.println("You entered the right password");

//do while is preferred bc the code is executed at least once before checking if the expressing is true
    }
}
