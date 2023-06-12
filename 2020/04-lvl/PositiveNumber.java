package lvl4;

/*
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PositiveNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br2.readLine());
        int n3 = Integer.parseInt(br3.readLine());

        int countPos = 0;
        if (n1>0) countPos++;               // То чувство, когда ты сидел полчаса писал код ниже,
        if (n2>0) countPos++;               // а чувак в комментах додумался до такого простого способа..
        if (n3>0) countPos++;
        System.out.println(countPos);

        /*if (n1 > 0 && n2 > 0 && n3 > 0) {
            int q = 3;
            System.out.println(q);
        }
        else if (n1 <= 0 && n2 <= 0 && n3 <= 0) {
            int q = 0;
            System.out.println(q);
        }
        else if (n1 > 0 && n2 <= 0 && n3 <= 0) {
            int q = 1;
            System.out.println(q);
        }
        else if (n1 <= 0 && n2 > 0 && n3 <= 0) {
            int q = 1;
            System.out.println(q);
        }
        else if (n1 <= 0 && n2 <= 0 && n3 > 0) {
            int q = 1;
            System.out.println(q);
        }
        else if (n1 > 0 && n2 > 0 && n3 <= 0) {
            int q = 2;
            System.out.println(q);
        }
        else if (n1 <= 0 && n2 > 0 && n3 > 0) {
            int q = 2;
            System.out.println(q);
        }
        else if (n1 > 0 && n2 <= 0 && n3 > 0) {
            int q = 2;
            System.out.println(q);
        }
        else if (n1 == 0 && n2 < 0 && n3 < 0) {
            int q = 0;
            System.out.println(q);
        }
        else if (n1 < 0 && n2 == 0 && n3 < 0) {
            int q = 0;
            System.out.println(q);
        }
        else if (n1 < 0 && n2 < 0 && n3 == 0) {
            int q = 0;
            System.out.println(q);
        }*/
    }
}
