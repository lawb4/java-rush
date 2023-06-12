package JavaRush.lvl6.StaticCats___________;

/*
Статические коты
*/

import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats;

    public Cat() {

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            new Cat();
            new Cat();
        }
        printCats();
    }

    public static void printCats() {
        System.out.println(cats);

    }

}

