package lvl4;

/*
Кошки во Вселенной
*/

public class CatUniverse {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // создали объект класса с именем cat1
        //Cat.count++; // не нужно, так как у нас метод внутри класса Cat - Cat() вызывает count++

        Cat cat2 = new Cat(); // создали объект класса с именем cat2
        //Cat.count++; // не нужно, так как у нас метод внутри класса Cat - Cat() вызывает count++

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
        Cat(){count++;}                         // варик с конструктором
    }                       // Конструктор - это метод внутри класса, который будет вызываться при
}                           // создании объекта класса.