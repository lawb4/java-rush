package JavaRush.lvl6;

/*
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 1; i <= 5; i++) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        /*String result = "";
        for (int i = 1; i <= count; i++) {
            result = result + s;
        }
        return result;*/

        /*String result = "";
        StringBuffer buf = new StringBuffer();
        for (int i = 0, i < count; i++) {
            buf.append(s);
        }
        result = buf.toString();*/////////////////////doesnt work
        return s;
    }

    public static void main(String[] args) {
        System.out.println(multiply("asd", 1000000));

    }
}


