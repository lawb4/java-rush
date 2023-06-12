package lvl4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
*/

public class PlusMinus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a > 0) {
            a = a * 2;
            System.out.println(a);
        }
        if (a < 0) {
            a++;
            System.out.println(a);
        } else if (a == 0) {
            System.out.println("0");
        }
    }
}