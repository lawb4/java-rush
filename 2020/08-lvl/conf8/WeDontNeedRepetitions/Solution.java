package lvl8.conf8.WeDontNeedRepetitions;

/*
Нам повторы не нужны
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();

        map.put("NeRoronoa", "Zoro");
        map.put("Iuta", "Ken");
        map.put("Poite", "Victor");
        map.put("Ewac", "Jack");
        map.put("Pox", "Amanda");
        map.put("SnovaNeRoronoa", "Zoro");
        map.put("Bell", "Drake");
        map.put("Peck", "Josh");
        map.put("Monkey D", "Luffy");
        map.put("Roronoa", "Zoro");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        // работаем только со ЗНАЧЕНИЯМИ из мапы
        ArrayList<String> list = new ArrayList<>(map.values()); // обрати внимание на скобки_!
        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                removeItemFromMapByValue(map, list.get(i));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }

        }

        /*for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair);
        }*/
    }

    public static void main(String[] args) {

        /*Map<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/

    }
}
