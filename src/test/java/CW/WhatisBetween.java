package CW;

public class WhatisBetween {
    /*
    Complete the function that takes two integers
    (a, b, where a < b) and return an array of all integers between the input parameters, including them.

For example:

a = 1
b = 4
--> [1, 2, 3, 4]
     */

    public static int[] between(int first, int last){
        int[] arr = new int[last-first+1];

        int index =0;
        for (int i=first; i<=last; i++){
            arr[index] = i;
            index++;
        }
        return arr;
    }
}
