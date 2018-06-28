package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
        String password = "luby";
        String input = " ";

        do while (!input.equals(password)){
            System.out.println("Enter password ");
            input = myScanner.nextLine();
        }while (!input.equals(password));{
            System.out.println("Correct password, please enter again");
            input = myScanner.nextLine();
        }
        System.out.println("You entered the right password");

//do while is preffered bc...
    }
}
