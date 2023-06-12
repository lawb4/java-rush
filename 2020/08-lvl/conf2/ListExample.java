package lvl8.conf2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hades");
        list.add("Nyx");
        list.add("Zagreus");

        //получение итератора для списка
        Iterator<String> iterator = list.iterator();

        //проверка, есть ли ещё элементы
        while (iterator.hasNext()) {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }
}
