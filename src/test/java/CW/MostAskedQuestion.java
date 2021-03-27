package CW;

public class MostAskedQuestion {
/*
//What is the most asked question on CodeWars?

//Can someone explain /*...*/

//You need to write a function detect that will check if a string starts with Can someone explain, case sensitive. Return true if so, false otherwise.

//Let's hope you don't write a solution that makes people ask that question at you

    public static boolean detect (String comment){

        return comment.startsWith("Can someone explain");
    }

    /*
    Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
     */
    public static int findSmallestInt(int[] args) {
    int min =Integer.MAX_VALUE;
    for (int i =0; i<args.length; i++){
        if (args[i]<min){
            min= args[i];
        }
    }
        return min;
    }
    public static int doubleInteger(int i) {
        // Double the integer and return it!


        return i*2;
    }

}

