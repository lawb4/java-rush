package lvl4;

/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CrossBlind {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());

        //  Нам важно не то, что за час происходит 12 циклов светофора
        //  (по 5 минут на цикл), а остаток.

        if (t % 5 < 3 || t % 5 == 5) {
            System.out.println("зеленый");
        }

        if (t % 5 >= 3 && t % 5 < 4) {
            System.out.println("желтый");
        }

        if (t % 5 >= 4) {
            System.out.println("красный");
        }
    }
}