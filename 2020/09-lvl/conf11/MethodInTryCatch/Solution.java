package lv9.conf11.MethodInTryCatch;

/*
Метод в try..catch      14/04/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                int ins = Integer.parseInt(br.readLine());
                list.add(ins);
            }

        } catch (Exception e) {
            for (Integer num : list) {
                System.out.println(num);
            }
        }
    }
}
