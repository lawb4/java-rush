package lvl2.MinFour;

/*
Минимум четерых чисел           // RETURN LATER!!!!
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        min(a,b);
        if (min(a,b) > c && c < d) {
            return c;
        } else if (min(a,b) > c && c > d) {
            return d;
        }
        return min(a,b,c,d);
    }

    public static int min(int a, int b) {
        return Math.min(a,b);
    }

    public static void main(String[] args) throws Exception {

        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

