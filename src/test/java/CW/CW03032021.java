package CW;

public class CW03032021 {

    public static void main(String[] args) {
        System.out.println(GetSum(0, -1));
    }
    public static boolean isTriangle(int a, int b, int c){
    //f (a<=0 && b=<0 && c==0){
            return false;
       // }else return true;
//I couldn't solve this one.
    }

    //This time no story, no theory. The examples below show you how to write function accum:
    public static String accum(String s) {
        // your code
        String acc ="";

        for (int i = 0; i<s.length(); i++){
            acc+= s.charAt(i)*(i+1);
//I couldn't solve this one.

        }
        return acc;
    }

    public static int GetSum(int a, int b)
    {
        int sum =0;
        if(a<b){
            for (int i=a; i<=b; i++ ){
                sum+=i;
            }
        }else if (a==b){
            sum=a;
        }else if (a>b){
            for (int i=b; i<=a; i++ ){
                sum+=i;
            }
        }
        return sum;
    }
//Write a function which takes a number and returns the corresponding ASCII char for that value.

    public static char getChar(int c) {

return 'a';
    }






}
