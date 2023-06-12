package lvl4;

/*
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PosAndNegNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br2.readLine());
        int n3 = Integer.parseInt(br3.readLine());

        int countNeg = 0;
        if (n1 < 0) countNeg++;
        if (n2 < 0) countNeg++;
        if (n3 < 0) countNeg++;
        System.out.println("количество отрицательных чисел: " + countNeg);

        int countPos = 0;
        if (n1 > 0) countPos++;
        if (n2 > 0) countPos++;
        if (n3 > 0) countPos++;
        System.out.println("количество положительных чисел: " + countPos);
    }
}
