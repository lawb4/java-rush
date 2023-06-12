package JavaRush.lvl7.conf4.SoleMassivesSocializing;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arS = new String[10];
        int[] arN = new int[10];

        for (int i = 0; i < arS.length; i++) {  // заполнение массива строк с клавы
            arS[i] = br.readLine();                         // 10 раз считываем строки из клавы
        }
        for (int i = 0; i < arS.length; i++) {  // в каждую ячейку массива чисел записываем длину строки из массива строк
            arN[i] = arS[i].length();   // заполнение массива чисел значениями длины из массива строк
            System.out.println(arN[i]);
        }
    }
}

/* Вообще, можно было второй массив и не создавать, а просто воспользоваться
* System.out.println(arS[i].length());
* чтобы вычислить длину строк массива в численном выражении
* */