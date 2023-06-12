package lvl3;

/*
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaptureTheWorld {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        System.out.print(s2 + " " + "захватит мир через " + s1 + " лет. Му-ха-ха!");
    }
}