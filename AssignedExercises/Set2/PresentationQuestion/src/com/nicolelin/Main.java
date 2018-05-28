package com.nicolelin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int length;
        int width;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the length");
        length = myScanner.nextInt();
        System.out.println("Enter the width");
        width = myScanner.nextInt();

        int area = length * width;

        System.out.println("Area equals " + area);


    }
}
