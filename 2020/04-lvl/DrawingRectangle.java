package lvl4;

/*
Рисуем прямоугольник            // списал, но попробую объяснить самому себе...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DrawingRectangle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());


        for (int a = 0; a != m; a++) {   //a<m       // задаем значение переменной а = 0, которая будет увеличиваться на 1,
                                                // пока она не станет равной введенному с клавы значению m
            for (int b = 0; b != n; b++) {  //b<n    // задаем значение переменной b = 0, которая будет увеличиваться на 1,
                System.out.print(8);            // пока она не станет равной введенному с клавы значению n
            }
            System.out.println();               // печатаем восьмерки, пока b не станет равно n (заканчиваем цикл),
        }                                       // переходим на новую строку, проверяем внешний цикл и, если он действителен,
                                                // опять переходим к внутреннему циклу, и так повторяем, пока внешний цикл не откажет.
    }
}                       // m отвечает за строки (вертикаль), а n - за количество восьмерок в строке.
