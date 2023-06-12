package lvl4;

/*
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThereIsNoMuchGood {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            System.out.println(name);
            n--;
        }
    }
}

/*
   while (n-- > 0) {
       System.out.println(name);
       n--;
   }
*/