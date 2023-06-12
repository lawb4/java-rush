package lv9.conf6.ExceptionWithArrayuList;

/*
Исключение при работе с коллекциями List        11/04/2020
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
