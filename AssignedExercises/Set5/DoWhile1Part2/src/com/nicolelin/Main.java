package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        String password = "luby";
        String input = " ";
        System.out.println("Enter password ");
        input = myScanner.nextLine();

        do while (true){
        }while (!input.equals(password));
}
        System.out.println("You entered the right password");


    }

