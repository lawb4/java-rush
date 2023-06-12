package lv9.conf8.ExceptionInterceptionComitee;

/*
Группа перехвата исключений     11/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception3 e) {}
          catch (Exception2 e) {}
          catch (Exception1 e) {}
        /*Почему 3-2-1? В Джаве недостижимость кода является ошибкой. Исключение 3 не может быть
        * достигнуто, если следует за Исключением 1. (Шилдт, Руководство для начинающих. Глава 9) */
        // Внизу чекни наследование
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {}
class Exception2 extends Exception1 {}
class Exception3 extends Exception2 {}
