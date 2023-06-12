package lvl4;

/*
Письмо счастья
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HappinessLetter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        for (int i = 0; i < 10; i++) {   // 0 and <10 || 1 and <=10
            System.out.println(text + " любит меня.");
        }
    }
}
