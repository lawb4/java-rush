package lvl4;
/*
Суммирование            // Закомментнутый варик проверился в Раше норм,
*/                      // второй вроде тоже работает, но в Раше не проходит
                            // UPD: Спасибо Павлу из комментов на Раше. Стало понятнее!
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aggregation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;                                    // тут сменить на 0
        int num = 0;  // здесь тоже это выражение на 0 поменять
                                                        //будет работать!!!!
        /*boolean go = true;
        while (go) {
            int number = Integer.parseInt(br.readLine());
            sum += number;

            if (number == -1)  {
                break;
            }
        }
        System.out.println(sum);*/

        while (num != -1) {
            num = Integer.parseInt(br.readLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
