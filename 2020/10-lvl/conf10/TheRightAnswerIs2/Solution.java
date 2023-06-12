package lv10.conf10.TheRightAnswerIs2;

/*
Правильный ответ: d = 1.0       22/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}
