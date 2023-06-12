package lv9.conf6.ExceptionWithArrays;

/*
Исключение при работе с массивами       11/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
