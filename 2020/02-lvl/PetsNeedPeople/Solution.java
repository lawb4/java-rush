package lvl2.PetsNeedPeople;

/*
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();

       Cat cat = new Cat();
       cat.owner = woman;

       Dog dog = new Dog();
       dog.owner = woman;

       Fish fish = new Fish();
       fish.owner = woman;

       /*
       Cat murzik = new Cat();
       Dog nala = new Dog();
       Fish nemo = new Fish();
       Woman alisa = new Woman ();

       murzik.owner = alisa;
       nala.owner = alisa;
       nemo.owner = alisa;
       */

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}