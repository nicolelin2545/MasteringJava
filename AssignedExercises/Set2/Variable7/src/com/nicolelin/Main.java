package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double bill;
	double tip;

	Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your bill amount");
        bill = myScanner.nextInt();
        System.out.println("Enter the your tip percentage in decimals");
        tip = myScanner.nextInt();
        double costwtax = bill * 1.13;
        double costoftip = bill * tip;
        double totalcost = costwtax + costoftip;

        System.out.println("Your bill with tax is " + costwtax);
        System.out.println("Your amount of tip is " + costoftip);
        System.out.println("Your total cost with tax and tip is " + totalcost);


    }
}
