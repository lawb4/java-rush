package lvl4;

/*
Сортировка трех чисел
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortThree {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br2.readLine());
        int n3 = Integer.parseInt(br3.readLine());

        if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        } else if (n3 >= n1 && n3 >= n2 && n2 >= n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n2 >= n1 && n1 >= n3 && n2 >= n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        } else if (n1 >= n3 && n1 >= n2 && n3 >= n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        } else if (n3 >= n1 && n3 >= n2 && n1 >= n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        }
    }
}