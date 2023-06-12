package JavaRush.lvl6;

/*
Кот и статика
*/

public class CatAndStatic {
    public static void main(String[] args) {
        // создай 10 котов
        for (int i = 1; i <= 10; i++) {     // (or) _ i = 0, i < 10
            Cat cat = new Cat();            // (or just) new Cat()
        }
        System.out.println(Cat.catCount);

        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount
        public static int catCount; // = 0;             // static variable

        public Cat(){catCount++;}                       //default constructor?
        // Создай конструктор
    }
}
