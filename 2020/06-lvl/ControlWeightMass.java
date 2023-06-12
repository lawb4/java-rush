package JavaRush.lvl6;

/*
Контролируем массу тела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlWeightMass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex (double weight, double height) {
            double index = weight / (height * height);

            if (index < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            } else if (index < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (index < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            } else {
                System.out.println("Ожирение: 30 или больше");
            }
        }     // Обрати внимание на else! Благодаря этому, не нужно сравнивать, например
    }     // интервал МЕЖДУ 18.5 и 25. Можно просто взять меньше 25, так как else уже высчитал грань.
}
