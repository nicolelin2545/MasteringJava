package com.nicolelin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a sentence ten words long with a secret message hidden in first letter of each word");
        String sentence = myScanner.nextLine();
        String firstletter = sentence.substring(0,1);


        int space1 = sentence.indexOf(" ");
        sentence = sentence.substring(space1+1);
        String secondletter = sentence.substring(0,1);

        int space2 = sentence.indexOf(" ");
        sentence = sentence.substring(space2+1);
        String thirdletter = sentence.substring(0,1);

        int space3 = sentence.indexOf(" ");
        sentence = sentence.substring(space3+1);
        String fourthletter = sentence.substring(0,1);

        int space4 = sentence.indexOf(" ");
        sentence = sentence.substring(space4+1);
        String fifthletter = sentence.substring(0,1);


        int space5 = sentence.indexOf(" ");
        sentence = sentence.substring(space5+1);
        String sixthletter = sentence.substring(0,1);


        int space6 = sentence.indexOf(" ");
        sentence = sentence.substring(space6+1);
        String seventhletter = sentence.substring(0,1);


        int space7 = sentence.indexOf(" ");
        sentence = sentence.substring(space7+1);
        String eigthletter = sentence.substring(0,1);

        int space8 = sentence.indexOf(" ");
        sentence = sentence.substring(space8+1);
        String ninthletter = sentence.substring(0,1);

        int space9 = sentence.indexOf(" ");
        sentence = sentence.substring(space9+1);
        String tenthletter = sentence.substring(0,1);

        System.out.println(fifthletter+secondletter+thirdletter+fourthletter+fifthletter+sixthletter+seventhletter+eigthletter+ninthletter+tenthletter);








    }
}
