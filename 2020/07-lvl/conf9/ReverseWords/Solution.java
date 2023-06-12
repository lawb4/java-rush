package JavaRush.lvl7.conf9.ReverseWords;

/*
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
        list.remove(2); // Нужно удалить 3ий элемент, но помни, что всё начинается с нуля(0)!

        for (int i = list.size() - 1; i >= 0; i--) {  // ОЧЕНЬ ВАЖНО! //Также глянь ReverseMassive\Solution.java
            System.out.println(list.get(i));
        }
    }
}
