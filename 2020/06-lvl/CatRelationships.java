package JavaRush.lvl6;

/*
Родственные связи кошек
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CatRelationships {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = br.readLine();
        Cat catGrandad = new Cat(granddadName);

        String grannyName = br.readLine();
        Cat catGranny = new Cat (grannyName);

        String fatherName = br.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandad);

        String motherName = br.readLine();
        Cat catMother = new Cat(motherName, catGranny, null);

        String sonName = br.readLine();
        Cat catSon = new Cat (sonName, catFather, catMother);

        String daughterName = br.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);


        System.out.println(catGrandad);
        System.out.println(catGranny);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {               // Класс кота
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {              // Конструктор №1
            this.name = name;
        }

        /*Cat(String name, Cat mother){
            this.name = name;
            this.mother = mother;
        }*/


        Cat(String name, Cat mother, Cat father) {  // Конструктор №2
            this.name = name;
            this.mother = mother;
            this.father = father;
        }



        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother" + ", no father ";
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father " ;
            else if (mother == null)
                return "The cat's name is " + name + ", no mother" + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + father.name + ", father is " + mother.name;
        }
    }
}
