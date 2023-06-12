package lv9.conf11.DivisionByZero;

/*
Деление на ноль         14/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int a = (int) (Math.random() * 10);
        int result = a / 0;
        System.out.println(result);
    }
}
