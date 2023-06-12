package lvl8.conf8.KindZinaidaAndSummerHolidays;

/*
Добрая Зинаида и летние каникулы
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();

        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Safronov", dateFormat.parse("JUNE 7 2011"));
        map.put("Kirilov", dateFormat.parse("APRIL 1 2012"));
        map.put("Savchenko", dateFormat.parse("JULY 20 2012"));
        map.put("Molotov", dateFormat.parse("JUNE 19 2011"));
        map.put("Votchin", dateFormat.parse("FEBRUARY 16 2012"));
        map.put("Norkov", dateFormat.parse("MARCH 11 2011"));
        map.put("Losnek", dateFormat.parse("AUGUST 12 2012"));
        map.put("Muternov", dateFormat.parse("OCTOBER 28 2011"));
        map.put("Krivolapov", dateFormat.parse("DECEMBER 25 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            if (value.getMonth() == 5 || value.getMonth() == 6 || value.getMonth() == 7) {
                iter.remove();  // опять проблема была в том, что я работал не с iter, а с map.remove(key,value)
            }
        }

        /*for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry);
        }*/
    }

    public static void main(String[] args) throws ParseException {
        //removeAllSummerPeople(createMap());
    }
}
