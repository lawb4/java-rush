package JavaRush.lvl7.conf12.MinMaxInMassives;

/*
Минимаксы в массивах
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[20];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }

        int maximum = ar[0];        // Будем сравнивать числа из массива с самым первым введеным значением
        int minimum = ar[0];

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < minimum) {
                minimum = ar[i];
            }
            if (ar[i] > maximum) {
                maximum = ar[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
