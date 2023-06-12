package lvl2.MinThree;

/*
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) { // Имеем интовский метод, след. нужен return;
        /*int result = 0;
        if (a <= b && a <= c) {
            result = a;
            return a;
        } else if (b <= a && b <= c) {                  // Моё решение, находясь в конце 5 лвла
            result = b;
            return b;
        } else if (c <= a && c <= b) {
            result = c;
            return c;
        }

        return result;
    }*/

        if (a < b) b = a;                   // из комментов
        if (b < c) c = b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
