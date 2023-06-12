package lv9.conf6.ExceptionWithNumbers;

/*
Исключение при работе с числами     11/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        }
        catch (RuntimeException e) {
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
