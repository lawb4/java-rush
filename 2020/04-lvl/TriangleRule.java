package lvl4;

/*
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangleRule {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br1.readLine());
        int c = Integer.parseInt(br2.readLine());

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}