package JavaRush.lvl7.conf9.DoublingTheWords;

/*
Удваиваем слова
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        ArrayList<String> result = doubleValues(list);  // это и есть вызов метода doubleValues !
        for (String s : result) {
            System.out.println(s);      // еще один цикл,чтобы элементы выводились каждый с новой строки
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}
