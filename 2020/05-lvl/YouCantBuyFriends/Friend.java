package lvl5.YouCantBuyFriends;

/*
Друзей не купишь
*/

public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String name) {           // Это конструктор класса Friend
        this.name = name;
    }

    public Friend(String name, int age) {   // Это конструктор класса Friend
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex) { // Это конструктор класса Friend
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
