package lvl4;
/*
Описываем числа     // В самом конце есть вариант решения через boolean
*/                  // и очень полезный вариант через length()
                    // int q = (n+"").length(); - приведение целого числа к строке.
                // Происходит запись числа, содержащегося в переменной n в строку.
                // Количество символов в строке подсчитывает оператор length() и
                // Присваивает это значение переменной q .

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DescribingNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n > 0 && n < 10) {
            if (n % 2 == 0) {
                System.out.println("четное однозначное число");
            } else /* if (n % 2 != 0) */ {
                System.out.println("нечетное однозначное число");
            }
        }

        if (n >= 10 && n <= 99) {
            if (n % 2 == 0) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        }

        if (n >= 100 && n <= 999) {
            if (n % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}


    /*
    boolean n1ch = (n > 0 && n < 10 && n % 2 == 0);
    boolean n1nch = (n > 0 && n < 10 && n % 2 != 0);
    boolean n2ch = (n >= 10 && n <= 99 && n % 2 == 0);
    boolean n2nch = (n >= 10 && n <= 99 && n % 2 != 0);
    boolean n3ch = (n >= 100 && n <= 999 && n % 2 == 0);
    boolean n3nch = (n >= 100 && n <= 999 && n % 2 != 0);

        if (n1ch) {
                System.out.println("четное однозначное число");
                } else if (n1nch) {
                System.out.println("нечетное однозначное число");
                }

                if (n2ch) {
                System.out.println("четное двузначное число");
                } else if (n2nch) {
                System.out.println("нечетное двузначное число");
                }

                if (n3ch) {
                System.out.println("четное трехзначное число");
                } else if (n3nch) {
                System.out.println("нечетное трехзначное число");
                }

     */

    /*

    int q = (n+"").length();

        if (q == 1 && n % 2 == 0) {
            System.out.println("четное однозначное число");
        } else if (q == 1 && n % 2 != 0) {
            System.out.println("нечетное однозначное число");
        }

        if (q == 2 && n % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (q == 2 && n % 2 != 0) {
            System.out.println("нечетное двузначное число");
        }

        if (q == 3 && n % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (q == 3 && n % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }

     */