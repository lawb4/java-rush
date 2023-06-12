package lvl8.conf6.TimeFor10000Gets;

/*
Время для 10 тысяч вызовов get
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list){
        Date startTime = new Date();
        get10000(list);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - startTime.getTime();

        return msDelay;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 1000000; i++) {
            list.get(x);
        }

    }
}
/*
* В чём суть деления на 2?
* Цикл Фор получает индекс элемента в середине списка(5000) и применяет get к нему 10000 раз
* Так как LinkedList может пойти либо с начала, либо с конца, то создается самая тяжелая ситуация
* при которой тратится максимальное количество времени
*
* Опять же. Суть проги - просто показать разницу в быстродействии между ArrayList и LinkedList
* при доставании(get) элемента из списка*/
