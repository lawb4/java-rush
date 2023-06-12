package lvl3;

/*
Конвертируем время
*/

public class ConvertTime {
    public static int convertToSeconds(int hour) {
        int seconds = hour * 3600;
        return seconds;
    }

    public static void main(String[] args) {

        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(10));


    }

}