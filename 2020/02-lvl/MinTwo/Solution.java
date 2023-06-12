package lvl2.MinTwo;

/*
Минимум двух чисел
*/
public class Solution {
    public static int min(int a, int b) {
      /* if (a<b)
           return a;
       else                //мое первое решение
           return b;

      */

      /* int c;
      if (a<b)
          c = a;
      else                  //решение по аналогии из лекции
          c = b;
      return c;

      */

      //return (a<b)? a:b;  //Нейки продвинутый метод

        return Math.min(a,b);  //нкм2
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}