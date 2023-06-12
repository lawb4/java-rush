package JavaRush.lvl6;

/*
Исправляем ошибки юности            // Смысл этой задачи в том, что у нас есть целочисл переменная с именем 'max'
*/                          // и строка с именем 'max'. Целочисл статическая. Чтобы у ней обратиться, перед
                                // именем переменной (max) указываем названием класса - YouthsMistakes.max !!!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class YouthsMistakes {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        YouthsMistakes.max = a > b ? a : b;    // Math.max (a,b);
        System.out.println(max + YouthsMistakes.max);

    }
}
