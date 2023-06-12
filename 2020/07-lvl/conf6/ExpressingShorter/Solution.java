package JavaRush.lvl7.conf6.ExpressingShorter;

/*
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        String shortest = list.get(0);    // сравниваем с первой введенной строкой
        for (int i = 0; i < list.size(); i++) {
            if (shortest.length() > list.get(i).length()) {
                shortest = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (shortest.length() == list.get(i).length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
