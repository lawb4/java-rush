package lvl4;

/*
Задаем количество котов
*/

public class CatQuantity {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
       CatQuantity.catsCount = catsCount;

    }

    public static void main(String[] args) {
        setCatsCount(catsCount);
        System.out.println(CatQuantity.catsCount);
    }
}