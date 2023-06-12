package JavaRush.lvl7.conf9.RorL;

/*
Р или Л
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза");       // index0
        list.add("лира");       // index1
        list.add("лоза");       // index2
        list = fix(list);

        for (String s : list) {     // Выводим на экран каждый элемент(строку) из списка, над которым работали в методе
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {

            if (list.get(i).contains("р") && (list.get(i).contains("л"))) {
                i++;    // Если содержит, идём дальше по строкам, ничего здесь не трогая

            } else if (list.get(i).contains("р")) {
                list.remove(i); // Если содержит, убирая эту строку из листа

            } else if (list.get(i).contains("л")) {
                list.add(i, list.get(i)); // Если содержит, добавляем сюда же ТУ ЖЕ САМУЮ строку и
                i += 2;     // перескакиваем через ДВА ИДЕНТИЧНЫХ СЛОВА, чтобы продолжить цикл с новой строкой

            } else i++;     // Это для ДРУГИХ слов. Сказано ничего с ними не делать. Пропускаем такое слово, как в 1Ифе
        }
        return list;    //Возвращаем "отредаченный" список в мейн и перебираем его
    }
}
