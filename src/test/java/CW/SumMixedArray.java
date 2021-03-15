package CW;

import javax.swing.*;
import java.util.List;

public class SumMixedArray {
    public static void main(String[] args) {

    }
    /*
    Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
     */
    public class MixedSum {

        /*
         * Assume input will be only of Integer o String type
         */
        public int sum(List<?> mixed) {
            int sum =0;

            for (Object each : mixed){
                if (each instanceof Integer){
                    sum += (Integer) each;
                }
                else if (each instanceof String){
                    sum += Integer.parseInt((String) each);
                }
            }

        return sum;
        }


}}
