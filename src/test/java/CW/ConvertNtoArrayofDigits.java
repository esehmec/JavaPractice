package CW;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ConvertNtoArrayofDigits {
    public static void main(String[] args) {
        System.out.println(digitize(12345));
    }
    /*
    Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example:
348597 => [7,9,5,8,4,3]
     */
    public static int[] digitize(long n) {
  String nums = new StringBuilder(String.valueOf(n)).reverse().toString();
 nums.split("");

    int[] digits = new int[nums.length()];

    for (int i =0; i<nums.length(); i++){
        digits[i] = Integer.parseInt(nums.substring(i,i+1));
    }
    return digits;
    }

}
