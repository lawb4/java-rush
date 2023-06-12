package JavaRush.lvl6;

/*
По 50 000 объектов Cat и Dog
*/

public class _50000CatsAndDogs {
    public static void main(String[] args) {
        for (int i = 1; i <= 50000; i++ ) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }

        /*int i = 0;
        Cat cat[] = new Cat[50000];
        Dog dog[] = new Dog[50000];
        while (i < 50000){
            cat[i] = new Cat();
            dog[i] = new Dog();
            i++
        }*/

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
