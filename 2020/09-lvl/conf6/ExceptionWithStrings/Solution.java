package lv9.conf6.ExceptionWithStrings;

/*
Исключение при работе со строками       11/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
