package lvl8.conf6.TheLongestConsequence;

/*
Самая длинная последовательность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(); // создаем список (привет полиморфизм! List)

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));      // Вводим с клавы значения
        }

        // Вводим два счётчика (СЧЁТЧИКИ В ТАКИХ СЛУЧАЯХ ДОЛЖНЫ ВСЕГДА НАЧИНАТЬСЯ С 1???)
        // Валидатор на Раше не захотел принимать счётчики по 0
        int count = 1;
        int max = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            // Проверка на совпадение значения в одном индексе и в том, ктр следует за ним
            //if ( (int) list.get(i) == (int) list.get(i+1)) { // вариант через приведение Integer'a к int
            if (list.get(i).equals(list.get(i + 1))) {
                count += 1;
            } else {
                count = 1; // присваиваем 1, так как может существовать последовательность
            }                           // из ОДНОГО ЗНАЧЕНИЯ!_?

            if (count > max) {
                max = count;
            }
        }
        System.out.print(max);
    }
}

