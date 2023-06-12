
package lvl5.CatMassacre;

/*
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Shurik", 20, 75, 100);
        Cat cat2 = new Cat("Girya", 21, 88, 1000);
        Cat cat3 = new Cat("Egorka", 20, 84, 500);

        /*cat1.fight(cat2);   // Спасибо комментам. Не мог понять, почему это лишнее.
        cat2.fight(cat3);     // А дело в том, что я провел 3 боя, а затем вывел на экран как
        cat3.fight(cat1);*/   // я ЕЩЁ РАЗ 3 боя провел :))))

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
