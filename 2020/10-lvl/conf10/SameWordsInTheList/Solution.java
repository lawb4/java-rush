/*
 * 4/24/20, 7:03 PM by  Yahor Labanau
 */

package lv10.conf10.SameWordsInTheList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }

        Map<String, Integer> map = countWords(list);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        int count = 0;

        for (int i = 0; i < list.size(); i++) {         // Сравниваем нулевой элемент
            for (int j = 0; j < list.size(); j++) {         // с нулевым (самим же собой)
                if (list.get(i).equals(list.get(j))) {
                    count += 1;
                }
                result.put(list.get(i), count);
            }
            count = 0;
        }


        return result;
    }
}
