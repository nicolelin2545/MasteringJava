package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int age;
        String name;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter age");
        age = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("Enter name");
        name = myScanner.nextLine();
        System.out.println("Your name is " + name + " and your age is " + age);

    }
}
