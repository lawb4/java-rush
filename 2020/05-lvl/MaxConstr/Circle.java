package lvl5.MaxConstr;

/*
Максимум конструкторов
*/

/* Суть этого задания в том, чтобы научить делать код короче
 *  за счёт вызова САМОГО ПЕРВОГО (дефолтного)
 *  конструктора путём this(x,y,radius), где вам нужно поставить свои числа
 *  в зависимости от того, какие переменные принимает конструктор
 */

/* Четыре конструктора нужны, если:
 * 1) мы можем вообще не вводить значения переменных (конструктор по умолчанию);
 * 2) ввести только одно значение;
 * 3) только два;
 * 4) либо 3 (в данном случае - все переменые). */

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {                       // Default Constructor (Конструктор по умолчанию).
        this(5, 5, 10);          // В обычных скобках нет данных!
    }

    public Circle(double x) {
        this.x = x;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}
