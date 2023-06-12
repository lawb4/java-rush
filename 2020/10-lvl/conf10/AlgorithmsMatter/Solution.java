/*
 * 4/24/20, 9:14 PM by  Yahor Labanau
 */

package lv10.conf10.AlgorithmsMatter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[30];

        for (int i = 0; i < 30; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }

        sort(ar);

        System.out.println(ar[9]);
        System.out.println(ar[10]);
    }

    public static void sort(int[] ar) {
        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < ar.length - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }
}
