package JavaRush.lvl7.conf9.RegulatingCheck;

/*
Проверка на упорядоченность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        for (int i = 1; i <= list.size(); i++) {     // Начинаем считать с 1 (со второго элемента, то бишь индекса 2)!!!
            if (list.get(i - 1).length() > list.get(i).length()) {
                System.out.println(i);  // выводим ИНДЕКС "нарушителя"
                break;  // Нам нужен только ПЕРВЫЙ нарушитель, а не все из списка
            }
        }
        /* А теперь пояснение ко второму циклу for. Итак, чтобы не загромождать код "левыми" переменными, мы будем
        * сравнивать __ПЕРВЫМ ДЕЛОМ__ ДЛИНУ СТРОКИ ПЕРВОГО ЭЛЕМЕНТА(КОТОРЫЙ В ИНДЕКСЕ 0) с ДЛИНОЙ СТРОКИ ВТОРОГО
        * ЭЛЕМЕНТА, КОТОРЫЙ В ИНДЕКСЕ 1).
        *   Если длина строки первого элемента больше длины строки второго, выводим ИНДЕКС этого первого элемента
        *           ДАЛЬШЕ ПОВТОРЯЕМ ТО ЖЕ САМОЕ ДО ВСЕХ ПОСЛЕДУЮЩИХ ЭЛЕМЕНТОВ, пока не закончится список. Обрати
        * внимание, что проверка проводится до тех пор, пока переменная i МЕНЬШЕ длины списка, иначе получим
        *   index out of bounds */
    }
}
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > list.get(i+1).length()) {
                System.out.println(list.get(0));
            } else if (list.get(i).length() < list.get(i+1).length()){
                System.out.println(list.get(i));
                break;
            }
        }*/
