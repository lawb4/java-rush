package lv9.conf11.TenCats;

/*
Десять котов        16/04/2020
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();

        map.put("1", new Cat("Murka"));
        map.put("2", new Cat("Baksik"));
        map.put("3", new Cat("Vaska"));
        map.put("4", new Cat("Boris"));
        map.put("5", new Cat("Kitti"));
        map.put("6", new Cat("Lera"));
        map.put("7", new Cat("Mur"));
        map.put("8", new Cat("Gav"));
        map.put("9", new Cat("Sonya"));
        map.put("10", new Cat("Lazy"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        /*for (Cat cat : map.values()) {
            set.add(cat);
        }*/

        for (Map.Entry<String,Cat> cats : map.entrySet()) {
            set.add(cats.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
