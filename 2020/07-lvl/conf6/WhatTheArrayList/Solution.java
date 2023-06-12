package JavaRush.lvl7.conf6.WhatTheArrayList;

/*
Что за список такой?            // Прокачананая версия задачки из комментов
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();       // Создание списка строк
        String [] abc = {"a", "b", "c", "d", "e"};

        /*String s1 = "a";    // Добавление 5-ти различных строк
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "e";

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);*/

        for (int i = 0; i < 5; i++) {
            list.add(abc[i]);
        }

        System.out.println(list.size());    // выведение размера списка строк на экран

        for (int i = 0; i < 5; i++) {           // выведение содержимого списка строк на экран
            System.out.println(list.get(i));
        }
    }
}
