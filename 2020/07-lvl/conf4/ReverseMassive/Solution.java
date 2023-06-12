package JavaRush.lvl7.conf4.ReverseMassive;

/*
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }
}
