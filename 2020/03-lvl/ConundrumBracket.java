package lvl3;

 /*
Головоломка со скобками
*/

public class ConundrumBracket {
    public static void main(String[] args) {
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));

        /* 382 / 2 = 191
           6 * 7 +5 = 42
           42 * 4 = 188
           188 + 3 = 191
           191 * 2 = 382
         */
    }
}