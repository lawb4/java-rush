package JavaRush.lvl7.conf6.TheMostMost;

/*
Самые-самые
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        String largest = list.get(0);
        String smallest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < smallest.length()) {
                smallest = list.get(i);
            }

            if (list.get(i).length() > largest.length()) {
                largest = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == smallest.length() || list.get(i).length() == largest.length()) {
                System.out.println(list.get(i));
                break;  // Если убрать брейк, на экране увидим ВСЕ самые короткие и ВСЕ самые длинные строки
            }
        }
    }
}
