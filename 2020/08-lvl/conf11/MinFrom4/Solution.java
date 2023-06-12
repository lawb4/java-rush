package lvl8.conf11.MinFrom4;

/*
Минимальное из N чисел
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));

    }

    public static int getMinimum(List<Integer> array) {
        Collections.sort(array);
        int min = array.get(0);

        return min;

        // or just
        //return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println();

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {                   // Столько раз повторится операция
            int num = Integer.parseInt(br.readLine());      // новая переменная с новым значением с клавы
            numList.add(num);
        }

        return numList;
    }
}
