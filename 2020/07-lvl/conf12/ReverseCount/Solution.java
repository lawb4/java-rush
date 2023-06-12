package JavaRush.lvl7.conf12.ReverseCount;

/*
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {    // Кидаем исключение (пока хз что это)
        for (int i = 30; i >= 0; i--) {         // вроде можно просто кинуть Exception

            Thread.sleep(100); // Метод работает с Миллисекундами (переменная long). Класс Thread.
                // 100 мс = 0.1сек
            System.out.println(i);
        }

        System.out.println("Бум!");
    }
}
