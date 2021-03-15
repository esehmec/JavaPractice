package CW;

import java.util.ArrayList;

public class Challenges03012021 {


    public static void main(String[] args) {
      //  System.out.println(solution("abc", "bc"));
        System.out.println(reverseWords("Eyyup Esra Vefa Duru"));
    }
    /*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
     */
    public static boolean solution(String str, String ending) {
        if (!str.contains(ending)){
            return false;
        }
        else{
            String strlast2 = str.substring(str.length()-2, str.length());
       if(strlast2.equals(ending)){

            return true;
        }
        return false;
    }}

    /*
    Complete the solution so that it reverses all of the words within the string passed in.
    ReverseWords.reverseWords("The greatest victory is that which requires no battle");
        // should return "battle no requires which that is victory greatest The"
     */
    public static String reverseWords(String str){
        //write your code here...
        String reverse = "a";
        String[] strList = str.split(" ");
        for (int i = strList.length-1; i == 0; i--){
            String temp = strList[i];
            reverse = reverse.concat(temp);
        }
        System.out.println(reverse);
        return reverse;
    }
}
