package lvl8.conf8.MoreThan10YouDontSuitUs;

/*
Больше 10? Вы нам не подходите
*/


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>(20);
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set)  {
        /*for (int i = 0; i < 20; i++) {
            if (i > 10) {
                set.remove(i);
            }
        }*/
                    // Вкратце, мы не можем проходить по коллекциям используя fori/foreach_?

        // Получение итератора для множества
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){     // проверка, есть ли еще элементы
            //получение текущего элемента и переход на следующий

            //Integer k = iterator.next();
            // или варик без присваивания переменной
            if (iterator.next() > 10)
                iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {
        // Спасибо Justinian!

        /*Set<Integer> set1 = createSet();
        Set<Integer> set2 = removeAllNumbersGreaterThan10(set1);
        set1.forEach(System.out::println);*/

        // или (мой первоначальный варик проверки (но он выводит в строку просто кучей_?)

        //System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
