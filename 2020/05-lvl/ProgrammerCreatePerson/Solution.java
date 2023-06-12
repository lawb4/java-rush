package lvl5.ProgrammerCreatePerson;
/*
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Hayro", 20);
        //System.out.println(person.name + ", " + person.age + " y.o.");
    }

    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
