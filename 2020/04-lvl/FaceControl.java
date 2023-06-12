package lvl4;

/*
Фейс-контроль
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FaceControl {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String name = br1.readLine();
        int age = Integer.parseInt(br2.readLine());

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
