package lvl5.ConstructingCats;

/*
Конструируем котиков
*/

public class Cat {
    private String name = null, address = null, color = "Black";
    private int age = 10, weight = 10;

    public Cat (String name){
        this.name = name;
    }
    public Cat (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat (int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
