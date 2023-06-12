package lv10.conf4.TaskN3forParsing;

/*
Задача №3 на преобразование целых типов     20/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        //System.out.println(f);
        int i = (int) f;
        //System.out.println(i);
        int b = (int) (i+f);
        //System.out.println(b);

        b = (byte) (i+f);

        System.out.println(b);
    }
}
