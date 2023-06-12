package JavaRush.lvl7.conf12.SoutNumsReverseOrder;

/*
Вывести числа в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {                   // Вводим 5 чисел
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i = list.size() - 1; i >= 0; i--) {    // за i принимаем размер листа(минус 1),
            System.out.println(list.get(i));    // чтобы не было indexOutOfBounds. Размер то 5, верно, но индексация
        }                                       // начинается с нуля !
    }
}
                /* Данное решение отличается тем, что оно каждую новую строку добавляет в НАЧАЛО списка, то есть,
                    * Последняя введенная нами строка(число) будет иметь index0, остальные смещаются вправо по индексу
                        * (1,2,3). При выводе всё начинается с нулевого индекса. Дальше понятно :) */

    /*for (int i = 0; i < 10; i++) {
        list.add(0, Integer.parseInt(br.readLine()));
        }
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
        }*/