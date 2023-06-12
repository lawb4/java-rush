package lvl8.conf8.TwentyWordsWithL;

/*
20 слов на букву "Л"
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> createSet() {
        Set<String> set = new HashSet<>(20);
        String[] ar = {
                "Лед",
                "Ледяной",
                "Леденец",
                "Ледник",
                "Льдышка",
                "Лоб",
                "Лизать",
                "Лето",
                "Летать",
                "Лён",
                "Лазурный",
                "Логичный",
                "Летопись",
                "Латынь",
                "Лингвист",
                "Лямбда",
                "Лось",
                "Луч",
                "Лоно",
                "Лёгкий"
        };

        for (int i = 0; i < 20; i++) {
            set.add(ar[i]);
        }

        return set;
    }

    public static void main(String[] args) {
        createSet();
    }
}
