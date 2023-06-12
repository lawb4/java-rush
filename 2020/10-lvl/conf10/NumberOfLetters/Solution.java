/*
 * 4/25/20, 5:32 PM by  Yahor Labanau
 */

package lv10.conf10.NumberOfLetters;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв              // СКАТАЛ РЕШЕНИЕ
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Алфавит
        List<Character> abc = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            list.add(s.toLowerCase());
        }

        /**//**//**//**//**//**//**//**//**//**//**//**//**//**/

        for (Character ch : abc) {      // работаем с каждой буквой в алфавитном листе
            int count = 0;                  // счетчик для каждой буквы
            for (String s : list) {     // работаем с тем,что записали с клавы в лист
                for (int i = 0; i < s.length(); i++) {     // смотрим на длину каждой строки в листе
                    if (s.charAt(i) == ch)
                        count++; // если какой-либо символ строки совпадает с какой-либо буквой алфавита, - счетчик +1
                }
            }
            System.out.println(ch + " " + count);   //Выводим с новой строки каждую букву и её счётчик
        }
    }
}
