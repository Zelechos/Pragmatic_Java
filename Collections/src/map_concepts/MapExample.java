package map_concepts;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map simpleMap = new HashMap();
        simpleMap.put("0f1b97254", "ethernet");
        simpleMap.put("sn3482334", "reverse");
        simpleMap.put("x9ct23n43", "electronic");
        simpleMap.put("h5h7d9934", "cyberpunk");

        var key = simpleMap.get("0f1b97254");
        System.out.println(key);

        simpleMap.keySet().forEach(element -> {
            System.out.println(element);
        });

        System.out.println("----------------------------------");

        simpleMap.values().forEach(element -> {
            System.out.println(element);
        });

        System.out.println("-------------- Map ----------------");
        System.out.println(simpleMap);

//        ESTO no se puede hacer porque no es un List o hijo de la interface Collection
//        simpleMap.forEach(element -> {
//            System.out.println(element);
//        });
    }
}
