package lvl4;

/*
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxFour {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br1.readLine());
        int n3 = Integer.parseInt(br1.readLine());
        int n4 = Integer.parseInt(br1.readLine());

        if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
            System.out.println(n1);
        } else if (n2 >= n1 && n2 >= n3 && n3 >= n4) {
            System.out.println(n2);
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
            System.out.println(n3);
        } else if (n4 >= n1 && n4 >= n2 && n4 >= n3) {
            System.out.println(n4);
        }
    }
}
