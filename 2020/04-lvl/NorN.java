package lvl4;

/*
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NorN {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String n1 = br1.readLine();
        String n2 = br2.readLine();

        if (n1.equals(n2)) {
            System.out.println("Имена идентичны");
        } else if (!n1.equals(n2) && n1.length() == n2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
