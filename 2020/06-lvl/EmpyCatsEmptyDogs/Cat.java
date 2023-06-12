package JavaRush.lvl6.EmpyCatsEmptyDogs;

/*
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }

}
