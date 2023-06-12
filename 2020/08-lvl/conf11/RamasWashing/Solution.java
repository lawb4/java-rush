package lvl8.conf11.RamasWashing;

/*
Омовение Рамы
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String z = s.toUpperCase(); // переменной z присваиваем написанное  _слово_ таким образом: СЛОВО
        System.out.print(z.charAt(0));  // пишем с Заглавной буквы первую букву введенного нами слова

        for (int i = 1; i < s.length(); i++) {
            // Если предыдущий символ пробел, - пишем с Большой буквы
            if (s.charAt(i - 1) == ' ')
                System.out.print(z.charAt(i));  // в char используем одинарные кавычки!
            // иначе, просто печатаем эту_букву_слова так, как было в задаче
            else System.out.print(s.charAt(i));
        }
    }
}
