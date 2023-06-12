package lv9.conf11.StaticsAreNotOnTheirPlaces;

/*
Статики не на своем месте       14/04/2020
*/

public class Solution {
    public static int A = 5;                /*static*/
    public static int B = 2 * A;            /*static*/
    public int C = A * B;       // C = 50
    public static int D = A * B;            /*static*/

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5; // к переменной D обращаемся по ИМЕНИ_КЛАССА
                        // в котором она объявлена,
                        // значит она дб СТАТИЧЕСКОЙ_!
    }

    public int getA() {
        return A;
    }
}
