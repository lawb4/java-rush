package lv9.conf11.WhatsTheDateToday;

/*
Какое сегодня число?        17/04/2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        SimpleDateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = oldFormat.parse(s);
        //parse() converts the String value of date to Date object
        String result = newFormat.format(date);
        //format() changes the date object to String format
        String upperCaseResult = result.toUpperCase();

        System.out.println(upperCaseResult);
    }
}
