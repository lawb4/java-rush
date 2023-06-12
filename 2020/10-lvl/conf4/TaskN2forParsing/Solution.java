package lv10.conf4.TaskN2forParsing;

/*
Задача №2 на преобразование целых типов     20/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d =  a * 1e-3 + c;

        System.out.println(d);
        System.out.println(1e-3);
    }
}
