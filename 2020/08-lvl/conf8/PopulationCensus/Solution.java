package lvl8.conf8.PopulationCensus;

/*
Перепись населения
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        // Помни, что ключи (Key) - уникальны (не могут повторяться!)

        map.put("Yekio", "Nejiro");
        map.put("Iuta", "Ken");
        map.put("Poite", "Victor");
        map.put("Ewac", "Jack");
        map.put("Pox", "Amanda");
        map.put("Kosgrove", "Miranda");
        map.put("Bell", "Drake");
        map.put("Peck", "Josh");
        map.put("Monkey D", "Luffy");
        map.put("Roronoa", "Zorro");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String firstName) {
        int countFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(firstName)) {
                countFirstName++;
            }
        }

        return countFirstName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countLastName = 0;

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String,String> pair = iter.next();
            if (pair.getKey().equals(lastName)) {
                countLastName++;
            }
        }
        /*for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                countLastName++;
            }
        }*/
        return countLastName;
    }

    public static void main(String[] args) {
        /* тестовая мапа

        *Map<String,String> people = createMap();
        *System.out.println(getCountTheSameFirstName(people, "Drake"));
        *System.out.println(getCountTheSameLastName(people, "Peck"));
        */

        //или

        /*System.out.println(getCountTheSameFirstName(createMap(), "Drake"));
        System.out.println(getCountTheSameLastName(createMap(), "Peck"));
        */

    }
}

// if (map.containsKey(lastName)) count++;