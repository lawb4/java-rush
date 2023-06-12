/*
 * 24.04.2020, 15:12 by  Yahor Labanau
 */

package lv10.conf10.ArrayOfLists;

/*
Массив списка строк
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] ar = createList();
        printList(ar);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] ar = new ArrayList[2];  // создаем массив списка строк (не ставим угловые скобки, потому что в массиве можно хранить листы разных типов - String, int, Integer, etc.

        ArrayList<String> list1 = new ArrayList<>();    // создаем сами списки 1
        list1.add("1");                                             // и
        list1.add("22");
        ArrayList<String> list2 = new ArrayList<>();    // 2, ну и добавляем туда что-нибудь
        list2.add("3");
        list2.add("44");

        ar[0] = list1;  // засовываем в ячейки массива эти самые листы
        ar[1] = list2;

        return ar;
    }

    public static void printList(ArrayList<String>[] ar) {
        for (ArrayList<String> list : ar) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
