package lvl3;

/*
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BigAndClean {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        System.out.print(s1 + " + " + s2 + " + " + s3 + " = Чистая любовь, да-да!");

    }
}