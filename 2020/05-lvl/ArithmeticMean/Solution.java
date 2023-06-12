package lvl5.ArithmeticMean;

/*
Среднее арифметическое   // Спасибо Peter из комментов на Раше! Смотри ниже;
*/                          // Обрати внимание на дополнительные скобки при замене условия!

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int a = 0; // кол-во цифр
        int num = 0;

        while (num != -1) { // замени условие на (num = Integer.parseInt(br.readLine()) != -1) и будет работать!! Спасибо Peter
            num = Integer.parseInt(br.readLine()); // и убери эту запись
            a++;
            sum += num;   // Короче, в начале цикла, при проверке num, оно проверит не -1, а предыдущее значение
        }                   // поэтому ничего и не получается.
        double mean = (double) sum / a;                 // не забывай, что дабл это значение с плавающей точкой!
        System.out.println(mean);

        /*while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
            break;
            }
            a++;
            sum += num;
        }
        double mean = (double) sum / a;    // Мы не можем интовские значения закинуть в дабл без приведения
        System.out.println(mean);*/         // то есть чтоб результат стал вещественным, а не целочисленным
        // будет выводится целое число с .0
    }
}
