package lv9.conf6.ExceptionWithNumbersAgain;

/*
Исключение при работе с числами     11/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
