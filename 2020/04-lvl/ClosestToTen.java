package lvl4;

/*
Ближайшее к 10
*/

public class ClosestToTen {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int a1 = a - 10;
        int b1 = b - 10;

        abs(a1);
        abs(b1);

        if (abs(a1) > abs(b1)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        //System.out.println(abs(10-a) <= abs(10-b) ? a : b);
    }
    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}