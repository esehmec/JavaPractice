package CW;

public class Challenges03022021 {
    public static void main(String[] args) {

    }

    //Given an array of integers, find the one that appears an odd number of times.
    public class FindOdd {
        public  int findIt(int[] a) {
            int odd = 5;

            for (int i =0; i<a.length; i++){
                int temp = a[i];
                int counter = 0;
                for (int z =0; z<a.length; z++){
                    if (temp==a[z]){
                        counter++;
                    }
                }
                if (counter%2==1){
                    odd = a[i];
                }

            }
           return odd;
        }
    }

    //Check to see if a string has the same amount of 'x's and 'o's.
    // The method must return a boolean and be case insensitive. The string can contain any char.
    public class XO {

        public  boolean getXO (String str) {
        str = str.toLowerCase();
        int x = 0;
        int o = 0;

        for (int i =0; i<str.length() ; i++){
            if (str.charAt(i)=='x'){
                x++;
            }else if (str.charAt(i) =='o'){
                o++;
            }
        }


        return (x == o);
        }
    }

    //You've just moved into a perfectly straight street with exactly n identical houses on either side of the road.
    // Naturally, you would like to find out the house number of the people on the other side of the street.
    // The street looks something like this:
    class CodeWars {
        public long overTheRoad(long address, long n) {
            // Good luck


            return 0;
        }

    }
}
