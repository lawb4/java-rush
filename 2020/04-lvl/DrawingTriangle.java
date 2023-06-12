package lvl4;

/*
Треугольник из восьмерок                // Для доп. пояснений обратись к задаче DrawingRectangle;
*/                                      // Мой варик первый

public class DrawingTriangle {
    public static void main(String[] args) {
        /*for (int a = 1; a <= 10; a++) {     // Внешний цикл отвечает за кол-во строк;
            for (int b = 0; b < a; b++) {   // Внутренний цикл отвечает за кол-во символов "8";
                System.out.print(8);    // Исполняется тело цикла;
            }
            System.out.println(); // Вне зоны внутреннего цикла !НО! не внешнего!;
        }*/

        String s = "8";
        for (int a = 1; a <= 10; a++) {
            System.out.println(s);              // Вариант решения из комментов
            s = s + "8";
        }

    }
}
