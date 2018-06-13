package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int mark;
        System.out.println("Enter your mark");
        mark = myScanner.nextInt();

        if (mark >= 0 && mark < 101) {
            if (mark >= 75 && mark < 101) {
                System.out.println("Great");
            }

            if (mark >= 50 && mark <= 74) {
                System.out.println("Pass");
            }

            if (mark >= 0 && mark < 50) {
                System.out.println("Fail");
            }
        } else {
            System.out.println("invalid");
        }
    }
}





