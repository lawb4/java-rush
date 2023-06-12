package lvl4;

/*
Как зовут кота?
*/

public class Cat {
    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;               //приравниваем переменную name метода setName к переменной name класса Cat ?
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}