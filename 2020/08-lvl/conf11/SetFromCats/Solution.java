package lvl8.conf11.SetFromCats;

/*
Set из котов
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //Iterator<Cat> iter = cats.iterator();
        /*if (iter.hasNext()) {
            iter.next();
            iter.remove();
        }*/
        //
        //cats.remove(iter.next());
        //
        cats.remove(cats.iterator().next());    // удаляет первый попавшийся элемент из множества Set

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

        /*public Cat() {

        }*/
    }
}
