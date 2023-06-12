package lvl8.conf11.SameLastNameAndName;

/*
Однофамильцы и тёзки
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        /*Map<String, String> map = createPeopleMap();
        printPeopleMap(map);*/

        //or just

        printPeopleMap(createPeopleMap());
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Roronoa", "Tashigi");
        map.put("Winsmoke", "Nami");
        map.put("Poite", "Victor");
        map.put("Ewac", "Jack");
        map.put("Winsmoke", "Sanji");
        map.put("Kosgrove", "Miranda");
        map.put("Bell", "Drake");
        map.put("Peck", "Josh");
        map.put("Monkey D", "Luffy");
        map.put("Roronoa", "Zoro");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
