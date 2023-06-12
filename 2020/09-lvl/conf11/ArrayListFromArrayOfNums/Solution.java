package lv9.conf11.ArrayListFromArrayOfNums;

/*
Список из массивов чисел
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();

        int[] ar0 = {1, 2, 3, 4, 5};                //[5]
        int[] ar1 = {6, 7};                         //[2]
        int[] ar2 = {8, 9, 10, 11};                 //[4]
        int[] ar3 = {12, 13, 14, 15, 16, 17, 18};   //[7]
        int[] ar4 = new int[0];

        list.add(ar0);
        list.add(ar1);
        list.add(ar2);
        list.add(ar3);
        list.add(ar4);

        //list.add(new int[] {1,2,3,4,5});
        //list.add(new int[5]);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {      // работай с каждым массивом int[] в списке list
            for (int x : array) {        // в каждом таком массиве работай с каждым его элементом
                System.out.println(x);
            }
        }
    }
}
