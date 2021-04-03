package CW;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int[] arrays = {2,3,4,5,6,7};
                System.out.println(divisibleBy(arrays, 2));
    }

    /*
Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.

Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
     */

    public static Object[] divisibleBy(int[] numbers, int divider) {
        List list = new ArrayList<Integer>();
        for (int i =0; i<numbers.length; i++){
            if (numbers[i]%divider==0){
                list.add(numbers[i]);
            }
        }
        int[] res = new int[list.size()];
        System.out.println(res.toString());
        return list.toArray();

    }

}