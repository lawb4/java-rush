package lvl4;
/*
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShortcutsAndNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n < 0 && n % 2 == 0) {
            System.out.println("отрицательное четное число");
        } else if (n < 0 && n % 2 != 0) {
            System.out.println("отрицательное нечетное число");
        } else if (n > 0 && n % 2 == 0) {
            System.out.println("положительное четное число");
        } else if (n > 0 && n % 2 != 0) {
            System.out.println("положительное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
