package lvl4;

/*
Цель установлена!
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TargetAcquired {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br1.readLine());
        int b = Integer.parseInt(br2.readLine());

        if (a>0 && b>0) {
            System.out.println(1);
        } else if (a<0 && b>0) {
            System.out.println(2);
        } else if (a<0 && b<0) {
            System.out.println(3);
        } else if (a>0 && b<0) {
            System.out.println(4);
        }
    }
}
