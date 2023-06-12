package lvl5.BossSomethingIsOff;   // Прога считывает 2 числа и вычисляет их сумму;

/*
Шеф, что-то не пашет
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
