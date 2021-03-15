package CW;

import java.util.Arrays;

public class SquashTheBugs {
    /*
    Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value.
     Output should be the length of the longest word, as a number.

There will only be one 'longest' word.
     */
    public static int findLongest(final String str) {
    String[] spl = str.split(" ");
        int longest =0;

        for (String each : spl){
            if (each.length()>longest){
                longest = each.length();
            }
        }
        return longest;
    }



}
