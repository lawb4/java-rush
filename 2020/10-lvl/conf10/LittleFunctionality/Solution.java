/*
 * 4/24/20, 9:49 PM by  Yahor Labanau
 */

package lv10.conf10.LittleFunctionality;

/*
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        // Мой вариант закомментирован, вариант с эксепшеном - с Раша.

        /*String s;
        while (!(s = br.readLine()).isEmpty()) {
            int id = Integer.parseInt(s);
            String name = br.readLine();

            map.put(name, id);
        }*/


        while (true) {
            try {
                int id = Integer.parseInt(br.readLine());
                String name = br.readLine();

                map.put(name, id);
            } catch (Exception e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}