package JavaRush.lvl6;

/*
Расстояние мжеду двумя точками
*/

public class DistanceBetweenTwoDots {
    public static double getDistance (int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        return Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));
            // Math.pow (a,2) - значение a будет возведено в степень 2 (= a^2)
    }               // или Math.pow(x2-x1 , 2)

    public static void main(String[] args) {

    }
}
