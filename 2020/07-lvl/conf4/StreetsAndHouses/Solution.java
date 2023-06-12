package JavaRush.lvl7.conf4.StreetsAndHouses;

/*
Улицы и дома
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[15];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                count += ar[i];
            } else count -= ar[i];
        }
        if (count > 0) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if (count == 0) {
            System.out.println("Жителей поровну!");
        } else
        System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}
