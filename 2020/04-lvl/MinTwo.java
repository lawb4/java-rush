package lvl4;

/*
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinTwo {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br2.readLine());

        if (n1 < n2) {
            System.out.println(n1);
        } else if (n1 == n2) {
            System.out.println("Оба числа равны");
        } else {
            System.out.println(n2);
        }
    }
}