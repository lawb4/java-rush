package lvl4;

/*
Три числа
*/
import java.io.BufferedReader;              // Обрати внимание на решение в Ифе!
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br1.readLine());
        int n2 = Integer.parseInt(br1.readLine());
        int n3 = Integer.parseInt(br1.readLine());

        int orderN1 = 1;
        int orderN2 = 2;
        int orderN3 = 3;

        if (n1 != n2 && n1 != n3 /* && n2 == n3 */) {
            System.out.println(orderN1);
        } else if (n2 != n1 && n2 != n3 /* &&  n1 == n3 */) {
            System.out.println(orderN2);
        } else if (n3 != n1 && n3 != n2 /* && n1 == n2 */) {
            System.out.println(orderN3);
        }
    }
}
