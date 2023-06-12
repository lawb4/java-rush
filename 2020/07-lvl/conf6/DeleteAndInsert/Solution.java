package JavaRush.lvl7.conf6.DeleteAndInsert;

/*
Удалить и вставить
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
        for (int i = 0; i < 13; i++) {
            String lastString = list.get(list.size()-1);          // Три ОЧЕНЬ важные строки!!!

            list.remove(list.size()-1);
            list.add(0, lastString);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
