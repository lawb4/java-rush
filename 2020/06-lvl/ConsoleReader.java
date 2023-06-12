package JavaRush.lvl6;

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string1 = br.readLine();
        return string1;

    }

    public static int readInt() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int int1 = Integer.parseInt(br.readLine());
        return int1;
    }

    public static double readDouble() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double double1 = Double.parseDouble(br.readLine());
        return double1;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean boolean1 = Boolean.parseBoolean(br.readLine());
        return boolean1;
    }

    public static void main(String[] args) throws Exception {

    }

}
