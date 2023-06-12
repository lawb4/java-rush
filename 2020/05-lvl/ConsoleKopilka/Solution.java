package lvl5.ConsoleKopilka;

/*
Консоль-копилка         // Задачка на внимательность о считывании с клавы и о переводе в целочисл!
*/              // Также обрати внимание, что после цикла с ифом у нас происходит перевод в целочисл
        // и вычисление суммы, а не ДО цикла!!

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num;

        while (true) {
            String s = br.readLine();// Считал с клавы некую строку и поместил ее в 's'
            if (s.equals("сумма")) { // Если в этой строке слово "сумма", нужно прервать цикл
                System.out.println(sum); // а если нет, то надо получить из этой строки число и прибавить к имеющейся сумме.
                break;
            }
            num = Integer.parseInt(s); // Сначала у меня тут было num = Integer.parseInt(br.readLine());
            sum += num;      // Спасибо комментам! Я понял, что таким образом
            // я считываю с клавы новую переменную, а не перевожу введенное значение в целочисл (если оно таковым является)
        }
    }
}

// Где ты получаешь число из строки 's'? Нигде. Вместо этого ты ЕЩЕ РАЗ обращаешься к консоли
// и считываешь НОВУЮ СТРОКУ, и из нее уже получаешь число.
