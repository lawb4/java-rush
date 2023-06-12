/*
 * 4/24/20, 8:26 PM by  Yahor Labanau
 */

package lv10.conf10.SafeEjectionFromTheList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Безопасное извлечение из спика
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 1, 1));
        System.out.println(safeGetElement(list, 5, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            //index = list.get(index);
            //return index;
            return list.get(index);

        } catch (Exception e) {
            return defaultValue;
        }
    }
}
