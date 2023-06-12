package JavaRush.lvl7.conf4.OneBigMassiveAndTwoSmall;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar0 = new int[20];
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        for (int i = 0; i < ar0.length; i++) {
            // считываем 20 значений                        // в цикле FOR в скобках мы работаем
            ar0[i] = Integer.parseInt(br.readLine());       // в рамках диапазона конкретного массива!!! а не смешиваем
        }

        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = ar0[i];
        }

        for (int i = 0; i < ar2.length; i++) {   // диапазон ar2 = [10], нужно присвоить ему ar0 [c 10 по 20]
            ar2[i] = ar0[i + 10];       // ar2[0] = ar0[10], ar2[1] = ar0[11] , et cetera
        }

        for (int i = 0; i < ar2.length; i++) {
            System.out.println(ar2[i]);
        }
    }
}

/*for (int i = 0; i < ar1.length; i++) {
        ar1[i] = ar0[i];
        ar2[i] = ar0[i+10];
 */