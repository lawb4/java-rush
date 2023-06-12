package JavaRush.lvl7.conf12.ThisIsTheEnd;

/*
Это конец
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String s;
        while (!(s = br.readLine()).equals("end")) {
            list.add(s);
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// Альтернативный вариант решения

        /*while (true) {
            String s = br.readLine();

            if (s.equals("end")) {      // Если нет этого слова, то переходим дальше вниз к list.add(s);
                break;
            }

            list.add(s);
        }*/

//////////////////////

// Какие-то мои наброски

        /*while (true) {
            list.add(br.readLine());

            for (int i = 0; i < list.size() - 1; i++) {     // -1, чтобы не учитывать строку "end"

                if (br.readLine().equals("end")) {
                    System.out.println(list.get(i));
                    break;
                }
            }
            break;
        }*/

