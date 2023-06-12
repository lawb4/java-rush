package JavaRush.lvl7.conf4.ReverseStringMassive;

/*
Массив из строчек в обратном порядке
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] ar = new String[10]; // Начинается с 0 !!! Наибольший ИНДЕКС массива - это его длина-1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ar.length - 2; i++) {
            ar[i] = br.readLine();
        }

        for (int i = ar.length - 1; i >= 0; i--) { // начинаем с 9 элемента массива, т.к он стартует с 0
            System.out.println(ar[i]);
        }
    }
}
