package JavaRush.lvl7.conf9.ContinuingWithWashingRama;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] list1 = {"мама", "мыла", "раму"};

        for (int i = 0; i < 3; i++) {
            list.add(list1[i]);
            list.add("именно");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
