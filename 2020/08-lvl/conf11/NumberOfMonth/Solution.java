package lvl8.conf11.NumberOfMonth;

/*
Номер месяца
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Введите имя месяца: ");
        String s = br.readLine();

        Map<String, Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        for (Map.Entry<String, Integer> pair : months.entrySet()) {
            if (s.equals(pair.getKey())) {
                System.out.println(pair.getKey() + " is the " + pair.getValue() + " month");
            }
        }
    }
}
