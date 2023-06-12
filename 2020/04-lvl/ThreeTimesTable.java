package lvl4;

/*
Таблица умножения               // Да-а-а-а-а... Попосидел над этой я задачей.
*/                              // Решил ужасно, даже валидатор не принял, зато пытался (внизу).

public class ThreeTimesTable {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;

        while (a <= 10) {
            while (b <= 10) {                        // Выполняем внутренний цикл, пока он не станет неработоспособным
                System.out.print(a * b + " ");       // а затем переходим к операциям за фигурными скобками
                b++;
            }

            a++;
            b = 1;      // устанавливаем значение 1, чтобы вновь работал внутренний цикл

            System.out.println();
        }



        /*int ver = 0;//

        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};      // счет массива начинается с 0


        int hor = 0;//
        while (hor < 10) {
            System.out.print(m[0] + " ");
            m[0]++;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[1] + " ");
            m[1] += 2;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[2] + " ");
            m[2] += 3;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[3] + " ");
            m[3] += 4;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[4] + " ");
            m[4] += 5;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[5] + " ");
            m[5] += 6;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[6] + " ");
            m[6] += 7;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[8] + " ");
            m[8] += 9;
            hor++;
        }

        System.out.println();
        hor = 0;

        while (hor < 10) {
            System.out.print(m[9] + " ");
            m[9] += 10;
            hor++;
        }*/


    }
}


