package lvl3;

/*
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TellTheFuture {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        System.out.print(s1 + " " + "получает " + s2 + " " + "через " + s3 + " лет.");

    }
}
