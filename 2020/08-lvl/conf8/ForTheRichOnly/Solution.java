package lvl8.conf8.ForTheRichOnly;

/*
Только для богачей
*/

import java.util.HashMap;
import java.util.Iterator;      // Еще можно через копию мапы 03.04.2020
import java.util.Map;

public class Solution {
    public static Map<String, Integer> createMap() {
        String[] name = {
                "Zagreus",
                "Theseus",
                "Megaera",
                "Dusa",
                "Nyx",
                "Hades",
                "Thanatos",
                "Achilles",
                "Skelly",
                "Hermes",
        };
        int[] cash = {800, 400, 500, 350, 700, 1000, 800, 200, 1, 600};



        Map<String, Integer> map = new HashMap<>();
        // Вместо двух массивов можно было:
        //map.put("Zagreus", 800);
        //map.put...

        for (int i = 0; i < 10; i++) {
            map.put(name[i], cash[i]);
        }

        /*for (Map.Entry<String,Integer> pair : map.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }*/

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        // Можно перебирать только ключи: Iterator<Integer> iter = map.values().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> pair = iter.next();

            String key = pair.getKey();
            Integer money = pair.getValue();

            if (money < 500) {
                iter.remove();
            }
            //Iterator<Integer> iterator = map.();
        }
        //System.out.println(map.entrySet());
    }

    public static void main(String[] args) {
        /*Map <String, Integer> mapResult = createMap();
        removeItemFromMap(mapResult);
        System.out.println(mapResult);*/
    }
}
