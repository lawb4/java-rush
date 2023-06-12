package lvl4;

/*
Рисуем линии    // Можно через sout между циклами, но следует вспомнить
*/              // функции print && printl, а также поменять знаки

public class DrawingLines {
    public static void main(String[] args) {
        int n = 8;

        for (int i = 1; i < 10; i++) {
            System.out.print(n);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(n);
        }
    }
}
