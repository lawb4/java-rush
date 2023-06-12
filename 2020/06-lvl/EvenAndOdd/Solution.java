package lvl6.EvenAndOdd;

/*
Чётные и нечетные циферки       // Сначала я мудрил в вайле, думал, 0 не то будет. Поставил туда MIN_VALUE.
*/                                  // В итоге прога работала бесконечно....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());  // Считываем строку с клавы и переводим ее в целочисл

        /*while (num != 0) {      // При num = 0, рез-тат будет `0, 0`
             if (num % 2 == 0) {        // Если число делится без остатка на 2 (т.е. остаток равен нулю), значит
                 even++;                    // оно ЧЕТНОЕ       // увеличиваем счётчик чётных
             } else odd++;          // Иначе оно НЕЧЕТНОЕ       // увеличиваем счётчик нечётных
            num /= 10;          // Это нужно выполнять после определения чётн/нечётн цифры для того, чтобы перейти на
        } */                              // предыдущую цифру числа

        for (int i = 1; i <= num; i *= 10) {
            int s = (num / i) % 2;
            if (s == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);   // вывод на экран
    }
}
