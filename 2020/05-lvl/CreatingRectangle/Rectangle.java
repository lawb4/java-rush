package lvl5.CreatingRectangle;

/*
Создать класс прямоугольник (Rectangle)
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public Rectangle (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle (int top, int left) {
        this.top = top;
        this.left = left;
    }
    public Rectangle (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle (Rectangle copy){
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {

    }
}
