import java.lang.reflect.Array;

public class CodingBat {
    public static void main(String[] args) {
    boolean mix = mixStart("cix");
        System.out.println(String.valueOf(mix));
        //System.out.println(echars("eee"));
        echars("eeeee");
    }
/*
hasOne
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.


hasOne(10) → true
hasOne(22) → false
hasOne(220) → false
 */
    public static boolean hasOne(int n) {
        String nStringValue = String.valueOf(n);
    if (n>0 && nStringValue.contains("1")){
        return true;
    }
        return false;
    }

/*

Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public static  boolean mixStart(String str) {
    if (str.length()<3){return false;}

    String secandthird = str.substring(1,3);
    System.out.println(secandthird);
    if (secandthird.equals("ix")){return true;}
    else return false;
}

/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
    public static int closerValue(int a, int b){
        int absa = Math.abs(10-a);
        int absb = Math.abs(10-b);

        if (absa==absb){
            return 0;
        }else if(absa<absb){
            return a;
        }else return b;

    }
/*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
    public static boolean echars(String str){

        int counter =0;
        for (int i =0; i<str.length(); i++){
            String chari = str.valueOf(str.charAt(i));
            if (chari.equals("e")){
                counter++;
            }
        }
        if (counter>=1 && counter<=3){
            return true;
        }else return false;
    }
    /*
    frontTimes

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static String fronTimes(String str, int n){
        String copies = "";
        int front;
        if (str.length()<3){
            front = str.length();
        }else{
            front=3;
        }

        for (int i=0; i<=n; i++){
         //   copies == copies + str.substring(0,front);
        }
        return copies;
    }

    /*
copyEndy
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.
Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.


copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
     */

    public static int isEndy( int[] array){

        int counter= 0;
        for (int n =0; n<array.length; n++){

            if ((n<=10 && n>=0) || (n<=100 && n>=90)){
                counter++;
            }}

        return counter;
    }
    public static void copyEndy(int[] arrayN){
        int[] endyarray = new int[isEndy(arrayN)];

        for (int i=0; i<arrayN.length; i++){
          //  if (arrayN.)

            }
        }






}
