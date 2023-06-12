package lvl5.ManAndWoman;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man ("Григорий", 47, "Мозырь");
        Man man2 = new Man ("Егор", 20, "Мозырь");

        Woman woman1 = new Woman ("Светлана", 47, "Мозырь");
        Woman woman2 = new Woman ("Янина", 11, "Мозырь");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
}

    public static class Man {
        String name;
        int age;
        String address;

        public Man (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
