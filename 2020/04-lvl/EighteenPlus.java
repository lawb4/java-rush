package lvl4;

/*
18+
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EighteenPlus {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String name = br1.readLine();
        int age = Integer.parseInt(br2.readLine());

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
