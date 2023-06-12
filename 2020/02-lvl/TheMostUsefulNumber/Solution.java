package lvl2.TheMostUsefulNumber;

/*
Самое нужное число
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x; // y = 3
        // x = x * 2;
        x = x * 16; // x = 16
        // y = y + 2 * x;
        y = y + x; // y = 3 + 16 = 19

        System.out.println(y);
    }
}