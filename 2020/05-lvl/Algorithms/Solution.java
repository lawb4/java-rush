package JavaRush.lvl5;

/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int maximum = Integer.MAX_VALUE;

        if (N > 0) {
            for (int count = 1; count <= N; count++) {       // При таком, я ввожу число, которое обозначает
                int num = Integer.parseInt(br.readLine());   // кол-во чисел, ктр будут учавствовать в
                maximum = maximum > num ? num : maximum;     // сравнении, а потом оно мне выводит минималку из них
            }
            System.out.println(maximum);
        }*/

        /*
        ---------------------------------------------------------------------------
        int maximum = Integer.MIN_VALUE;          // Это решение с костылем!!!
        ----------------------------------------------------------------------------
        if (N > 0) {
            for (int count = 1; count <= N; count++) {       // При таком, я ввожу число, которое обозначает
                int num = Integer.parseInt(br.readLine());   // кол-во чисел, ктр будут учавствовать в
                maximum = maximum < num ? num : maximum;     // сравнении, а потом оно мне выводит минималку из них
            }
            System.out.println(maximum);
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N > 0) { // условие для значения, которое будет указывать на кол-во вводимых новых значений
            int maximum = Integer.parseInt(br.readLine()); // считываем с клавы новое значение (ПЕРВОЕ)
                // Иными словами, мы этому ПЕРВОМУ значению присваиваем гипотетический MIN_VALUE.

            for (int i = 1; i < N; i++) { // кол-во чисел, участвующих в проверке; //типа 1 уже, потому что выше мы ввели 1 значение
                int num = Integer.parseInt(br.readLine()); // считываем с клавы каждое;
                if (num > maximum) maximum = num;
            }       // если какой-либо из вводимых значений > нашего ПЕРВОГО значения, то
                // это ПЕРВОЕ значение становится равным по значению NUM. Если нет, то выводим на экран ПЕРВОЕ.
            // это всё происходит внутри кода, все эти сравнения и вычисления.

            System.out.println(maximum);
        }
        // если N <= 0, то 'if' и 'for' пропускаются. Ничего на экран не выводится.
    }
}
