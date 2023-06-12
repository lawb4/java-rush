package lvl8.conf6.TimeFor10000Inserts;

/*
Время для 10 тысяч вставок
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date startTime = new Date();    // Получаем текущую дату

        insert10000(list);                  // подрубаем метод вставки 10.000 элементов

        Date newTime = new Date();      // Ещё раз получаем текущую дату (после завершения метода)
        long msDelay = newTime.getTime() - startTime.getTime(); // Вычисляем разницу между ними

        return msDelay; // возвращаем полученное значение
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++){
            list.add(0, new Object());
        }
    }
}
