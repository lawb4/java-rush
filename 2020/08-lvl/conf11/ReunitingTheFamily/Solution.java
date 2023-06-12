package lvl8.conf11.ReunitingTheFamily;

/*
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //ArrayList<Human> nullChildren = new ArrayList<>();
        // it's empty

        ArrayList<Human> firstGenChildren = new ArrayList<>();

        Human ch1 = new Human("Егор", true, 20);
        Human ch2 = new Human("Хэйро", true, 16);
        Human ch3 = new Human("Янина", true, 11);

        firstGenChildren.add(ch1);
        firstGenChildren.add(ch2);
        firstGenChildren.add(ch3);

        ArrayList<Human> fatherList = new ArrayList<>();
        Human father = new Human("Григорий", true, 47, firstGenChildren);
        fatherList.add(father);

        ArrayList<Human> motherList = new ArrayList<>();
        Human mother = new Human("Светлана", false, 47, firstGenChildren);
        motherList.add(mother);

        Human gf1 = new Human("Владимир", true, 80, fatherList);
        Human gf2 = new Human("Пётр", true, 40, motherList);

        Human gm1 = new Human("Евдокия", false, 70, fatherList);
        Human gm2 = new Human("Валентина", false, 73, motherList);

        Human[] ar = {gf1, gf2, gm1, gm2, father, mother, ch1, ch2, ch3};
        // создаю массив людей, засовываю туда всех членов семьи и вывожу на экран
        // можно ТАКЖЕ списком собрать содержимые остальных списков
        for (Human human : ar) {
            System.out.println(human.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();  // инициализация списка в классе

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {  // Переопределение метода toString()
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;


                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
