package lvl2.FirstConventer;

/*
Наш первый конвертер!                                                  
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double TF = 9 / 5.0 * celsius + 32 ;

        return TF;


    }
}