package lvl5.Constructor;

/*
Конструктор
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red"); // Мы в объекте класса Circle вызвали объект класса Color
        System.out.println(circle.color.getDescription());  // и уже из него вызвали метод setDescription
    }

    public void Circle() {          // Это уже не конструктор по умолчанию, если
        color = new Color();        // стоит void. Нужно просто убрать это.
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
