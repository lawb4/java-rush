package JavaRush.lvl6;

/*
Чётные и нечётные циферки
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EvenAndOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        String numS = br.readLine();

        int[] result = new int[numS.length()];
        for (int i = 0; i <= numS.length(); i++) {
            result[i] = Integer.parseInt(numS.charAt(i)+"");         ?????
        }
        return result;

        */
        int num = Integer.parseInt(br.readLine());

        /*while (num > 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }*/
        for (   ; num > 0; num /= 10) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}
