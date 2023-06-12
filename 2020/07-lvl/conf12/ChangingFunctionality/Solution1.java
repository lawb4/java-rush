package JavaRush.lvl7.conf12.ChangingFunctionality;

/*
Меняем функциональность
*/

// Очень интересная задачка! Суть здесь в том, что мы добавляем строку несколько раз в
// ОДИН И ТОТ ЖЕ ИНДЕКС_!!

// "Удваивать и утраивать нужно не ЭЛЕМЕНТЫ списка (индексы), а ЗНАЧЕНИЯ элементов списка(в одном индексе)_!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();     // создаем 1ый список

        while (true) {
            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() % 2 == 0) {
                list1.add(s + " " + s);

            } else {
                list1.add(s + " " + s + " " + s);
            }
        }

        // Из комментов на Раше (с использованием тернарного оператора

        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            list1.add(s.length() % 2 == 0 ? (s + " " + s) : (s + " " + s + " " + s));
        }*/

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}


        /*for (int i = 0; i < list.size(); i++) {     // Пока счётчик i меньше размера 1ого листа, делай следующее
            String s = list.get(i);             // получи каждый элемент из первого листа и присвой его 's'
            resultList.add(s.toUpperCase()); // Добавь во 2ой список все эти элементы, только придай им верхний регистр
        }

        for (int i = 0; i < resultList.size(); i++) {   // Пока счётчик i меньше размера 2ого листа, делай следующее
            System.out.println(resultList.get(i));      // выводи на экран строки
        }
    }
}*/

// Вот то же самое, только без создания второго списка_?

/*
while (true) {
            String s = br.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            list.add(s.toUpperCase());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        */
