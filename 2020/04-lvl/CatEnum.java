package lvl4;

/*
Учет котов
*/

public class CatEnum {
    private static int catsCount = 0;       //  переменная

    public static void addNewCat() {        //  метод
        CatEnum.catsCount = catsCount + 1;

    }

    public static void main(String[] args) {
        addNewCat();                            //  нужно было вызвать метод...
        System.out.println(CatEnum.catsCount);
    }
}