package lvl5.Trikotaj;

/*
Трикотаж            // В мейне, при создании объектов, я использовал конструктор, передав ему в качестве параметров имя, возраст....
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 10, 5, 100);
        Cat cat2 = new Cat("Baksik", 15, 10, 1000); // а это аргументы?? *смотри ниже "параметры"*
        Cat cat3 = new Cat("Kuzya", 5, 7, 999);
    }

    public static class Cat { // Это называется Конструктор. Это Метод
        private String name;  //
        private int age;      // это всё параметры??
        private int weight;   //
        private int strength; //

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
