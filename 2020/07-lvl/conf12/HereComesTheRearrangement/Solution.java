package JavaRush.lvl7.conf12.HereComesTheRearrangement;

/*
Перестановочка подоспела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());        // Такой размер будет у нашего списка
        int m = Integer.parseInt(br.readLine());
        //n = list.size();

        for (int i = 0; i < n; i++) {
            list.add(br.readLine());        // Вводим определенное кол-во строк, зависит от 'n'
        }

        for (int i = 0; i < m; i++) {
            list.add(list.remove(0));     // Удаляем его, элементы в списке сместились влево!
            // или можно
            // list.add(list.remove(0));
            // Как я понимаю, сначала выполняется операция ДОБАВЛЕНИЯ, а потом УДАЛЕНИЯ(в скобках)

            //Из коммента на Раше
            // Метод remove() записывает в дополнительную переменную(внутри себя) удаляемое значение и в результате
            // своей работы возвращает это самое значение, поэтому можно так добавлять
        }

        for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));    // вывод на экран
        }
    }
}
