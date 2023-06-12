package lvl4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
День недели
*/

public class DayWeek {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());

        if (a == 1) {
            System.out.println("понедельник");
        }

        if (a == 2) {
            System.out.println("вторник");
        }

        if (a == 3) {
            System.out.println("среда");
        }

        if (a == 4) {
            System.out.println("четверг");
        }

        if (a == 5) {
            System.out.println("пятница");
        }

        if (a == 6) {
            System.out.println("суббота");
        }

        if (a == 7) {
            System.out.println("воскресенье");
        }

        if (a < 1 || a > 7 ) {
            System.out.println("такого дня недели не существует");
        }
    }
}