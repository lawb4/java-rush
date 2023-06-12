package lvl8.conf11.AlgorithmsTask;

/*
Задача по алгоритмам        09.04.2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = new String[3];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = br.readLine();
        }

        sort(ar);

        for (String word : ar) {
            System.out.println(word);
        }
    }

    public static void sort(String[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (isGreaterThan(ar[j], ar[j + 1])) {
                    String temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'a' больше, чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
        // Если >, то выводит от А до Я
        // Если <, - от Я до А

        /* Или, если не писать отдельный метод

        if (ar[j].compareTo(ar[j+1]) > 0) {
                    String temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }*/
    }
}
