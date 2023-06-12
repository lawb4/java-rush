package JavaRush.lvl6.CatCounter;

/*
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    protected void finalize() throws Throwable {
        catCount--;
    }

    public static void main(String[] args) {

    }
}
