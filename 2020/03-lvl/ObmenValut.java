package lvl3;

/*
Обмен валют
*/

//ПОСЛЕДОВАТЕЛЬНОСТЬ МЕТОДОВ НЕ ВАЖНА!!!

public class ObmenValut {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd (1, 2.3));
        System.out.println(convertEurToUsd (5, 2.5));

        /* Кажется, самое главное здесь, что я понял, это то,
         что можно ОДНОВРЕМЕННО вывести на экран вызванный метод,
                 а не отдельно его вызывать, а потом писать. Отдельно лично
             у меня пока что не получается... */
    }

    public static double convertEurToUsd(int eur, double course) {
        /* double convert = eur * course;
        return convert;
        */

        return eur * course;

    }
}