package lvl8.conf2;
/*
Вывод на экран элементов Set
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hades");
        set.add("Nyx");
        set.add("Zagreus");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        //проверка, есть ли ещё элементы
        while (iterator.hasNext()) {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }
}
