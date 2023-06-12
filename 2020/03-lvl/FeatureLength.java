package lvl3;

/*
Полнометражная картина
*/

public class FeatureLength {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int result = centimetre / 100;
        return result;
    }
}
        // вызови мне функцию с таким-то значением
        // идем в функцию, делаем там вычисления, выводим в мейн функцию