package CW;

import java.util.Arrays;

public class SortAndStar {
    /*
    You will be given a vector of strings.
    You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.
     */
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String first = s[0];

        String result = "";
        for (int i =0; i<first.length(); i++){
            result +=  first.charAt(i);
        }


        return null;
    }


}
