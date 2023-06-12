package lvl4;

/*
Существует ли пара?
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumPair {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br1.readLine());
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        int n2 = Integer.parseInt(br2.readLine());
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        int n3 = Integer.parseInt(br3.readLine());

        if (n1 == n2 && n2 == n3 && n1 == n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        } else if (n1 == n2) {
            System.out.println(n1 + " " + n2);
        } else if (n2 == n3) {
            System.out.println(n2 + " " + n3);
        } else if (n1 == n3) {
            System.out.println(n1 + " " + n3);
        } else {
            System.out.println("Ни одно из введеных чисел не совпадает с другим.");
        }


    }
}