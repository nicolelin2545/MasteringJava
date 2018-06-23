package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        String password = "Luby";
        Scanner myScanner = new Scanner(System.in);
        String input = " ";

        while (!input.equals(password)){
            System.out.println("Enter password");
            input = myScanner.nextLine();
        }
        System.out.println("You guessed the password");
    }
}

