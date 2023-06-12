package lvl5.AssemblingRectangle;

/*
Собираем прямоугольник                  // ?Today's Insight?
*/      // Нельзя задать два метода с одинаковым количеством переменных одного типа,
// так как при вызове метода программа просто не поймет, какие именно переменные я хочу задать;
                            //
public class Rectangle {
    private int top, left, width, height;

    public void initialize (int top){
        this.top = top;
    }
    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
    }
    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize (Rectangle copy) {        // Копия прямоугольника
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {

    }
}
