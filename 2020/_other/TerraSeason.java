package JavaRush;

/*
Времена года на Терре
*/

import java.util.Scanner;

public class TerraSeason {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        month = sc.nextInt();

        if (month == 12 || month == 1 || month == 2) {         //  Вот как правильно записывать Иф
            System.out.println("зима");                         // с несколькими значениями
        }
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("осень");
        } else {
            System.out.println("unknown error occurred. Please, try again...");
        }
        System.exit(0);
    }
}