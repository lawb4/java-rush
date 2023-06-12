package lvl8.conf11.SoftwareModernization;

/*
Модернизация ПО     09.04.2020
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> families = new HashMap<>();

        while (true) {
            String city = br.readLine();
            if (city.isEmpty()) break;

            String family = br.readLine();
            if (family.isEmpty()) break;

            families.put(city, family);
        }

        String entry = br.readLine();   // Всё из-за того, что я засунул считыватель в цикл ниже))

        for (Map.Entry<String, String> pair : families.entrySet()) {
            if (entry.equals(pair.getKey())) {
                System.out.println(pair.getValue());
            }
        }

        /*List<String> list = new ArrayList<>();
        while (true) {
            String family = br.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(family);
        }

        // Read the house number
        int houseNumber = Integer.parseInt(br.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }*/
    }
}
