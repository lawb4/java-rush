package lv10.conf10.BigSalary;

/*
Большая зарплата        22/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        for (int i = 0; i < 40; i++) {
            System.out.println(s.substring(i));
            // с этого символа будет печататься строка
        }
    }
}
