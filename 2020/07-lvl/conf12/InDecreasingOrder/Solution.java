package JavaRush.lvl7.conf12.InDecreasingOrder;

/*
В убывающем порядке     // Внизу доп.инфа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;             // optional
import java.util.Arrays;


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[5]; // Создаем массив на 20 элементов

        for (int i = 0; i < ar.length; i++) {          // Пока счётчик меньше 20,
            ar[i] = Integer.parseInt(br.readLine());    // добавляем в массив числа
        }

        sort(ar);   // Вызываем метод sort

        for (int x : ar) {               // Перебираем каждый проинициализированный элемент 'x' в массиве,
            System.out.println(x);            // и выводим на экран
        }
    }

    public static void sort(int[] ar) {
        Arrays.sort(ar);    // сортируем по ВОЗРАСТАНИЮ
        int[] arCopy = Arrays.copyOf(ar, ar.length);

        for (int i = 0; i < ar.length; i++) {
            ar[i] = arCopy[arCopy.length - i - 1];
            // ar[0] = arCopy[5-0-1];
            // ar[1] = arCopy[5-1-1];
            // ar[2] = arCopy[5-2-1];
            // et cetera
        }
    }
}

// Очень крутое решение. Смысл следующий: умножаем все числа на -1. Теперь они отрицательные.
// Затем мы сортируем массив по возрастанию. Так как у нас отрицательные числа, - они пойдут в обратном порядке.
// Затем мы вновь умножаем на -1, и теперь у нас числа стали положительными, а порядок не изменился!

/*for (int i = 0; i < ar.length; i++) {
        ar[i] *= -1;
        }
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
        ar[i] *= -1;
        }
*/

/*for (int i = ar.length; i >= 0; i--) {
        ar[i] = arCopy[arCopy.length - i - 1];

        // ar[4] = arCopy[5-0-1];
        // ar[3] = arCopy[5-1-1];
        // ar[2] = arCopy[5-2-1];
        // et cetera
        // Разницы в циклах Фор нет, так как массивы всё равно выводятся по порядку их индексов (с нуля_0)
 }*/


// Через создание Списка вместо копии оригинального массива

    /*ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(ar);
     for (int i = 0; i < ar.length; i++) {
        list.add(0, ar[i]);                        // Добавляем в нулевой_0 индекс каждое новое число
        }
     for (int i = 0; i < ar.length; i++) {
        ar[i] = list.get(i);                       // Записываем в оригинальный массив числа из списка
        }*/

    /////////////////////////////////////////////////////////////////////////////
    // Обрати внимания на аргументы в методе! Используем объект Integer, а не int
    // С примитивами коллекции не работают_?

    // созданный массив также должен быть типа Integer, а не int_!

    /*public static void sort(Integer[] ar) {
        Arrays.sort(ar.Collections.reverseOrder());
    }*/
