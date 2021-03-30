package CW;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        reverse(5);
    }
    /*
    Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
     */
    public static int[] reverse(int n){
        //your code
        int[] newArr = new int[n];
        for (int i =n-1; i>=0; i--){
            newArr[i]=i+1;
        }
        return newArr;
    }


}
