package lvl8.conf3.CollectionMapFromCats;

/*
Коллекция Map из котов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{  //вроде как new String[] можно убрать
                "васька",
                "мурка",
                "дымка",
                "рыжик",
                "серый",
                "снежок",
                "босс",
                "борис",
                "визя",
                "гарфи",
        };

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {//на основа массива cats создаем и возвращаем коллекцию
        Map<String, Cat> map = new HashMap<>();

        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
            //Несмотря на то, что у нас есть массив, не забывай, что самих объектов-то
            // ещё нет! Нужно создать!
            //Cat cat = new Cat(cats[i]);
            //map.put(cat.name, cat);
            // 1ая и 2+3 строки эквивалентны!
        }
        return map;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
