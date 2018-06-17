package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Before answering questions, answer with Y for yes and N for no");
        System.out.println("Do you have $200 000 to $500 000?");

        String firstAnswerString = myScanner.nextLine();
        if (firstAnswerString.equalsIgnoreCase("Y")){
            System.out.println("Do you get places quickly ");
            String placesQuicklyAns = myScanner.nextLine();
            if (placesQuicklyAns.equalsIgnoreCase("Y")){
                System.out.println("Purchase a lamborghini");
            }else if (placesQuicklyAns.equalsIgnoreCase("N")){
                System.out.println("Purchase rolls royce phantom");
            }


        }else if(firstAnswerString.equalsIgnoreCase("N")) {
            System.out.println("Do you have $100 000 to $200 000?");
            String $200000ans = myScanner.nextLine();
            if ($200000ans.equalsIgnoreCase("Y")){
                System.out.println("Do you like imports");
                String importsans = myScanner.nextLine();
                if (importsans.equalsIgnoreCase("Y")) {
                    System.out.println("Purchase Nissan GTR");
                } else if (importsans.equalsIgnoreCase("N")){
                    System.out.println("Purchase a dodge viper SRT");
                }
            } else if ($200000ans.equals("N")){
                System.out.println("Purchase a Honda fit");
            }
        }
    }
}

