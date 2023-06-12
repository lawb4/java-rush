/*
 * 24.04.2020, 14:59 by Yahor Labanau
 */

package lv10.conf10.HumanConstructors;

/*
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        private String name;
        private int age;
        private double height;
        private double weight;
        private boolean sex;
        private boolean love;

        public Human (){}

        public Human (String name){}
        public Human (String name, int age){}
        public Human (String name, int age, double weight){}
        public Human (String name, int age, double weight, double height){}
        public Human (String name, int age, double weight, double height, boolean sex){}
        public Human (String name, int age, double weight, double height, boolean sex, boolean love){}
        public Human (int age, String name){}
        public Human (int age, String name, double weight){}
        public Human (String name, double height, int age){}
    }
}
