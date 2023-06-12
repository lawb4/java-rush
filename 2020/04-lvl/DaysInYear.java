package lvl4;

/*
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DaysInYear {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        //if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("количество дней в году: " + 366);
        } else {
            System.out.println("количество дней в году: " + 365);
        }
    }
}