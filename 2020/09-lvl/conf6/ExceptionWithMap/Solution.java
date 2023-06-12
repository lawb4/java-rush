package lv9.conf6.ExceptionWithMap;

/*
Исключение при работе с коллекциями Map     11/04/2020
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);

        } catch (NullPointerException e) {
            System.out.println(e);

            /*String s = e.getMessage();
            System.out.println(s);*/
        }
    }
}
