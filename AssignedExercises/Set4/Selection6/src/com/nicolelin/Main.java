package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    String password;
        System.out.println("Insert your password");
        password = myScanner.next();


        if (password=="happy"){
            System.out.println("You are logged in");
        }else {
            System.out.println("Incorrect password");
        }


    }
}
