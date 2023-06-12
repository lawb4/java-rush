package lv9.conf11.FinalCountdown;

/*
Обратный отсчёт     14/04/2020
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){}
            System.out.println(i);
        }
    }
}
