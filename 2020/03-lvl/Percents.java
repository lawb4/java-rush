package lvl3;

/*
Задача на проценты
*/

public class Percents {
    public static double addTenPercent(int i) {

    /* double percent = 1.1;
    return i * percent; */

    // return i*1.1;

        return i+i*0.1;
}

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}