package lvl4;

/*
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FeelsLikeMediocre {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());


        if (n1 == n2 && n2 == n3 && n1 == n3 ) {
            System.out.println(n3);

        } else if (n1 == n2 || n1 == n3) {
            System.out.println(n1);
        } else if (n2 == n3 || n1 == n2) {
            System.out.println(n2);

        } else if (n2 > n1 && n3 < n1 || n1 > n2 && n3 > n1) {
            System.out.println(n1);
        } else if (n1 > n2 && n3 < n2 || n2 > n1 && n3 > n2) {
            System.out.println(n2);
        } else if (n3 > n1 && n2 > n3 || n3 > n2 && n1 > n3) {
            System.out.println(n3);
        }
    }
}

