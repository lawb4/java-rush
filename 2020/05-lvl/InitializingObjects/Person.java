package lvl5.InitializingObjects;

/*
Инициализация объектов
*/

public class Person {
    private String name;
    private char sex;
    private int money, weight;
    private double size;

    public void initialize (String name, char sex, int money, int weight, double size){
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
