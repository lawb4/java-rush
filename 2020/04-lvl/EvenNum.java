package lvl4;

/*
Четные числа
*/

public class EvenNum {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; ++i) {
            System.out.println(++i);
        }

        /*for (int i = 1; i <= 100; i++) {
            for (; i % 2 == 0; i++) {
                System.out.println(i);
            }
        }*/

        /*
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */
    }
}
