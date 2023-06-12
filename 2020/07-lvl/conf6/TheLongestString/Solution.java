package JavaRush.lvl7.conf6.TheLongestString;

/*
Самая длинная строка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();    // создал список строк

        for (int i = 0; i < 5; i++) {       // считал с клавы 5 строк и добавил их в список strings
            strings.add(br.readLine());
        }

        String longest = strings.get(0);            // берем для сравнения первый ввод с клавы
        for (int i = 0; i < strings.size(); i++) {  // (список, как и массив, начинатеся с 0)
            if (strings.get(i).length() > longest.length()) { // если длина каждой строки списка больше длины строки 0 значения, то
                longest = strings.get(i);   // делаем это нулевое значение наибольшим   // нашли самую длинную строку в списке
            }
        }

        for (int i = 0; i < strings.size(); i++) {  // если какая-либо длина строки списка совпадает с НАИБОЛЬШЕЙ
            if (strings.get(i).length() == longest.length()) {
                System.out.println(strings.get(i)); // выводим ВСЕ НАИБОЛЬШИЕ строки
            }
        }
    }
}

   /* String longest = "0";
        for (int i = 0; i < 5; i++) {
        strings.add(br.readLine());

        if (strings.get(i).length() > longest.length()) {
        longest = strings.get(i);
        }
        }


        for (int i = 0; i < strings.size(); i++) {
        if (strings.get(i).length() == longest.length()) {
        System.out.println(strings.get(i));
        }
        }
        }
        }*/