package lv9.conf11.AlgorithmsTask;

/*
Задача по алгоритмам        19/04/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = br.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] ar = list.toArray(new String[0]);
        sort(ar);

        for (String x : ar) {
            System.out.println(x);
        }
    }

    public static void sort(String[] ar) {
        for (int i = ar.length; i > 0; i--) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (isNumber(ar[j]) && isNumber(ar[j + 1])) {
                    // Вот про запись выше я и не догадался!!
                    if (Integer.parseInt(ar[j]) < Integer.parseInt(ar[j + 1])) {
                        //и про Integer.parseInt тоже...
                        String temp = ar[j];
                        ar[j] = ar[j + 1];
                        ar[j + 1] = temp;
                    }
                }
                if (!(isNumber(ar[j]) && isNumber(ar[j + 1]))) {
                    if (isGreaterThan(ar[j], ar[j + 1])) {
                        String temp = ar[j];
                        ar[j] = ar[j + 1];
                        ar[j + 1] = temp;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк 'a' больше, чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if ((i != 0 && c == '-')    // строка содержит ' - '
                    || (!Character.isDigit(c) && c != '-')     // или не цифра и не начинается с ' - '
                    || (chars.length == 1 && c == '-'))         // или одиночный ' - '
            {
                return false;
            }
        }
        return true;
    }
}
