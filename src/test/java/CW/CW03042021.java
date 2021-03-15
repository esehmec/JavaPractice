package CW;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.Math.abs;

public class CW03042021 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Eyyup Esra Vefa Duru"));
        // System.out.println(squareSum([1,2,3,4]));
    }

    /*
    In a small town the population is p0 = 1000 at the beginning of a year.
    The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town.
    How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
     */
    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while (p < 1200) {
            year++;
            p = (int) (p * (1 + percent / 100) + 50);
        }
        return year;
    }

    //In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
    public static int makeNegative(final int x) {

        return (x < 0) ? x : -x;

    }

    //Complete the solution so that it reverses all of the words within the string passed in.
    public static String reverseWords(String str) {
        List word = Arrays.asList(str.split(" "));
        Collections.reverse(word);
        return String.join(" ", word);


    }

    /*
    In this game, the hero moves from left to right. The player rolls the die and moves the number of spaces indicated by the die two times.

    Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.
     */
    public static int move(int position, int roll) {


        return position + 2 * (roll);
    }

    /*
    Complete the square sum function so that it squares each number passed into it and then sums the results together.

    For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
     */
    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            result = +(n[i] * n[i]);
        }

        return -1;
    }


    /*
    Grade book
    Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.

    Numerical Score	Letter Grade
    90 <= score <= 100	'A'
    80 <= score < 90	'B'
    70 <= score < 80	'C'
    60 <= score < 70	'D'
    0 <= score < 60	'F'
     */

}