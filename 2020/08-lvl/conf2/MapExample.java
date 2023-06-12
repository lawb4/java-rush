package lvl8.conf2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //все элементы хранятся в парах
        Map<String, String> map = new HashMap<>();
        map.put("first", "Hades");
        map.put("second", "Nyx");
        map.put("third", "Zagreus");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение "пары" элементов
            Map.Entry<String, String> pair = iterator.next();
            //String key = pair.getKey();         //ключ
            //String value = pair.getValue();     //значение
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
