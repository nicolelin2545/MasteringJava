package com.nicolelin;

public class Main {

    public static void main(String[] args) {
	int result = 1+2;
        System.out.println("1+2=" + result);
        int previousResult = result;
        result=result-1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result= result * 10;
        System.out.println(previousResult+ "*10=" + result);
        boolean isAlien = false;
        if (isAlien==true);
        System.out.println("It is not an alien");
        int topscore= 110;
        if (topscore>100);
        System.out.println("You got higher than top score ");
        boolean isCar = false;
        if (isCar==true);
        System.out.println("Why is this happening");

        double myFirst = 20d;
        double mySecond = 80d;
        double myTotal = (myFirst + mySecond) * 25;
        double Remainder = myTotal%40;
        if (Remainder <= 20);
        System.out.println("Total was over the limit");
}
