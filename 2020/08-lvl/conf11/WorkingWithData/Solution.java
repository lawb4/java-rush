package lvl8.conf11.WorkingWithData;

/*
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat format = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);

        Date dateFrom = new Date(date);
        Date currentDate = new Date();

        currentDate.setHours(0);
        currentDate.setMinutes(0);
        currentDate.setDate(1);
        currentDate.setMonth(0);
        currentDate.setSeconds(0);
        currentDate.setYear(dateFrom.getYear());

        long time = dateFrom.getTime() - currentDate.getTime();
        long msDay = 1000 * 60 * 60 * 24;
        int result = (int) (time / msDay);

        return result % 2 != 0;
    }
}
