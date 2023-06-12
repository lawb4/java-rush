package lvl5.ImprovingFunctionality;       // Было дано 2 переменные, мы делаем 5 (меняем метод min)
                    // Под задачей еще пару вариантов решения из комментов!
/*
Совершенствуем функциональность
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        if (a < b) b = a;
        if (b < c) c = b;       // Очень прикольная арифметика
        if (c < d) d = c;       // нашёл ещё раньше в комментах
        if (d < e) e = d;       // к другой задаче на Раше
        return e;
    }
}

// Тернарный оператор
/* int min = a < b ? a : b;
    min = c < min ? c : min;
    min = d < min ? d : min;
    min = e < min ? e : min;
    return min;
 */

//