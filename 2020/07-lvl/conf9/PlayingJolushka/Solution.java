package JavaRush.lvl7.conf9.PlayingJolushka;

/*
Играем в Jолушку
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                list1.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
                list3.add(list.get(i));
            }
        }


        //printList(list);
        printList(list1);
        printList(list2);
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));        // Выводит каждую строку из списка на новой строке
            /*System.out.println(list);*/       // Выводит объект-список
        }
    }
}
