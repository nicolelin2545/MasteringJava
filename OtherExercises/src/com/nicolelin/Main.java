package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int candies;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter total number of candies");
        candies = myScanner.nextInt();
        int smashedcandies;
        smashedcandies = candies % 3;
        System.out.println("Number of candies crushed is " + smashedcandies);

    }
}
