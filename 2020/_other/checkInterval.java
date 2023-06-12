package JavaRush;

/*
Попадём-не-попадём
*/

public class checkInterval {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a >= 50 && a <= 100) {                                                //  && - ИЛИ
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}