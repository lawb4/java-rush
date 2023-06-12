package JavaRush.lvl7.conf12.CatProblemNotCompile;

/*
Не компилируется задача про котиков         // ПОРЯДОК ОЧЕНЬ ВАЖЕН!!!!!!!!!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = br.readLine();

            //if (name.equals(""))  // Походу нижний иф можно заменить одним этим условием

            // Походу этот name == null вообще нужно убрать..
        // "name == null" - отсутствует строка, там нет энтера,
        // "name.isEmpty()"  i.e = 0 - тут энтер и больше ничего
            if (name == null || name.isEmpty()) { // Как я понимаю, мы можем назвать кота Числом, поэтому проверяем,
                break;  //выходим из ЦИКЛА while  !!!     // чтобы вводимое значение не было ни числом, ни строкой
            }                           // нужно сделать пустой ввод (просто нажать на энтер)

        //"Если name - пустая строка, то что тогда будет считываться в остальные параметры?" @ IceBerg
          // (если поставить все остальные переменные после стринг нейм (и перед ифом))
            int age = Integer.parseInt(br.readLine());
            int weight = Integer.parseInt(br.readLine());
            int tailLength = Integer.parseInt(br.readLine());

            Cat cat = new Cat(name, age, weight, tailLength);
            CATS.add(cat);

        }

        printList();    // Прерываем цикл и запускаем метод

    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }


        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}

