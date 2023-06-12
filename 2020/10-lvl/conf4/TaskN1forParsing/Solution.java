package lv10.conf4.TaskN1forParsing;

/*
Задача №1 на преобразование целых типов     20/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        //System.out.println("b = " + b);
        byte c = (byte) (a * b);
        //System.out.println("c = " + c);
        double f = (char) 1234.15;
        //System.out.println("f = " + f);
        long d = (char) (a + f / c + b);
        System.out.println(d);
    }
}
