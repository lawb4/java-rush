package JavaRush.lvl7.conf12.FamilyEnumeration;

/*
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gd1 = new Human("Владимир", true, 70);
        Human gd2 = new Human("Петр", true, 40);
        Human gm1 = new Human("Евдокия", false, 65);
        Human gm2 = new Human("Валентина", false, 73);

        Human father = new Human("Григорий", true, 47, gd1, gm1);   // мы передаем ПЕРЕМЕННУЮ (gd1,gm1...)
        Human mother = new Human("Светлана", false, 47, gd2, gm2);  // Не нужно добавлять к ней ее тип или
        Human ch1 = new Human("Егор", true, 20, father, mother);    // что-то вроде того (Human.gd1...)
        Human ch2 = new Human("Янина", false, 11, father, mother);
        Human ch3 = new Human("Баксик", true, 14, father, mother);

        Human[] ar = {gd1, gd2, gm1, gm2, father, mother, ch1, ch2, ch3};
        // Создадим массив и переберем его. Выводим на экран.
        for (Human human : ar) {
            System.out.println(human);
        }
        /*for (int i = 0; i < ar.length; i++) {         // Это то же самое, что и Фор выше
            System.out.println(ar[i]);
        }*/
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            //System.out.println(toString()); //Можно сделать так, чтобы СРАЗУ ПРИ СОЗДАНИИ ОБЪЕКТА,
        }   // подходящего для этого конструктора, на экран сразу выводилась инфа о нем !

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            //System.out.println(toString());   // lo mismo
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
