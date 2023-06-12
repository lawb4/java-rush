package JavaRush.lvl7.conf12.ChangingFunctionality;

/*
Меняем функциональность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();     // создаем 1ый список

        while (true) {
            String s = br.readLine();
            if (s == null || s.isEmpty()) {     // можно бахнуть s.equals("end")
                break;  // Если в вводе пусто - выходим из цикла while и ЗАКАНЧИВАЕМ ПРОГУ
            }
            list.add(s);    // добавляем в список данные с клавы
        }

        ArrayList<String> resultList = new ArrayList<>();   // создаем 2ой список
        for (int i = 0; i < list.size(); i++) {     // Пока счётчик i меньше размера 1ого листа, делай следующее
            String s = list.get(i);             // получи каждый элемент из первого листа и присвой его 's'
            resultList.add(s.toUpperCase()); // Добавь во 2ой список все эти элементы, только придай им верхний регистр
        }

        for (int i = 0; i < resultList.size(); i++) {   // Пока счётчик i меньше размера 2ого листа, делай следующее
            System.out.println(resultList.get(i));      // выводи на экран строки
        }
    }
}

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