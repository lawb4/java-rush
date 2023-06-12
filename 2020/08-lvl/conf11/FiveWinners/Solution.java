package lvl8.conf11.FiveWinners;

/*
Пять победителей    08.04.2020     // нужно больше почитать про алгоритмы сортировок вручную....
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        sort(array);

        /*for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }*/

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {              // сортировка пузырьком
        /*Внешний_цикл каждый раз сокращает фрагмент массива,
        так как внутренний_цикл каждый раз ставит в конец
        фрагмента максимальный(при >)_! / минимальный (при <)_! элемент*/
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                /*Сравниваем элементы попарно,
                если они имеют неправильный порядок,
                то меняем местами (как я понял, толькаем все маленькие значения вправо и больше их не рассматриваем*/
                if (array[j] < array[j + 1]) {         // если <, то по_убыванию, а если > - по_возрастанию
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
