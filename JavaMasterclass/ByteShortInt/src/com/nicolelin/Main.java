package com.nicolelin;

public class Main {

    public static void main(String[] args) {
        int myValue=10000;
        byte myByteValue= 10;
                short myShortNumber= 11;
                        long myLongValue = (long) (50000+10*myByteValue+myShortNumber+myValue);
                        System.out.println(myLongValue);
    }
}
