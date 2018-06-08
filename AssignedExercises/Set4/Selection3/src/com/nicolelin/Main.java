package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
	    int temperature;
        System.out.println("Enter a temperature");
        temperature = myScanner.nextInt();

        if (temperature>30){
            System.out.println("hot");
        }else if (temperature==20-30){
            System.out.println("comfortable");
        }else if (temperature==10-19){
            System.out.println("cool");
        }else if (temperature<=9){
            System.out.println("cold ");
        }


    }
}
