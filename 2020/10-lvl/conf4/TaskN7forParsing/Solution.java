package lv10.conf4.TaskN7forParsing;

/*
Задача №7 на преобразование целых типов     20/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;   // сначала делаем операции с l, а потом прибавляем _1_
        l = (long) f / 1000;

        System.out.println(l);
    }
}
