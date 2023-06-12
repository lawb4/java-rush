package lvl5.CatInitialization;

/*
Кошкоинициация              // Можно задать нужные параметры прямо в Классе, а можно отдельно в
*/                          // методах initialize;

public class Cat {
    private String name = null, address = null, color = "Grey";
    private int age = 15, weight = 10;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
    }

    public void initialize(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
