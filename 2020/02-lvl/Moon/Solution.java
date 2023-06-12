package lvl2.Moon;

/*
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight = 0.17 * earthWeight;
       return moonWeight;
    }
}