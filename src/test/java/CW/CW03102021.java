package CW;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;

public class CW03102021 {
    public static void main(String[] args) {
        System.out.println(disemvowel("abcedeeeesfdfd"));


        System.out.println(solve("8123456677531"));
    }



    /*
    Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
     */

    public static String disemvowel(String str) {
        String vowels = "aeiouAEIOU";
        String novowel = "";

        for (int i =0; i< str.length(); i++){
            if (!vowels.contains(str.substring(i,i+1))){
                novowel+=str.charAt(i);
            }
        }
        return novowel;
    }

    //You have read the title: you must guess a sequence. It will have something to do with the number given.
    static int[] sequence(int x) {


        return new int[0];
    }
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] strlist = str.split(" ");

        for (String word : strlist){
           // word.substring(word.length()-1) = word.substring(0,1));
        }
        return "a";
    }
    /*
    In the following 6 digit number:

283910
91 is the greatest sequence of 2 consecutive digits.

In the following 10 digit number:

1234567890
67890 is the greatest sequence of 5 consecutive digits.

Complete the solution so that it returns the greatest sequence of five consecutive digits found within the number given.
The number will be passed in as a string of only digits.
It should return a five digit integer. The number passed may be as large as 1000 digits.
     */
    public static int solve(final String digits) {
        int max = 0;
        for (int i =0; i<digits.length()-4; i++){
            int temp = Integer.parseInt(digits.substring(i,i+5));
           max = (temp > max) ? temp:max;
        }
        return max;
    }

    /*
 John wants to decorate a room with wallpaper. He wants a fool-proof method for getting it right.

John knows that the rectangular room has a length of l meters, a width of w meters, a height of h meters.
 The standard width of the rolls he wants to buy is 52 centimeters. The length of a roll is 10 meters.
 He bears in mind however, that it’s best to have an extra length of wallpaper handy in case of mistakes or
 miscalculations so he wants to buy a length 15% greater than the one he needs.

Last time he did these calculations he got a headache, so could you help John?

Task
Your function wallpaper(l, w, h) should return as a plain English word in lower case the number of rolls he must buy.

Example:
wallpaper(4.0, 3.5, 3.0) should return "ten"

wallpaper(0.0, 3.5, 3.0) should return "zero"

Notes:
all rolls (even with incomplete width) are put edge to edge
0 <= l, w, h (floating numbers); it can happens that w * h * l is zero
the integer r (number of rolls) will always be less or equal to 20
FORTH: the number of rolls will be a positive or null integer (not a plain English word; this number can be greater than 20)

In Javascript English numbers are preloaded and can be accessed as:

numbers = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve","thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"]
For other languages it is not preloaded but you can use the above one if you need it.
     */

    public String wallpaper(double l, double w, double h) {
        double roll = 1.15* (l * w * h)/(10 * 0.52);
         String[] nbs = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};

        return nbs[(int) roll];
    }

    public int min(int[] list) {
        int minvalue = Integer.MAX_VALUE;
        for (int i: list){
            minvalue = (i<minvalue)? i:minvalue;
        }
        return minvalue;
    }

    public int maxvalue(int[] list) {
       Arrays.sort(list);
        return list[0];
    }


}
