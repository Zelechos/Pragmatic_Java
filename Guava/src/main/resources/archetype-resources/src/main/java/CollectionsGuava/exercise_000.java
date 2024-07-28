package CollectionsGuava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;

public class exercise_000 {

    public static void main(String[] args) {

        ListMultimap<String, String> multimap = ArrayListMultimap.create();
        multimap.put("0", "zelechos@hotmail.com");
        multimap.put("1", "alexth@gmail.com");
        multimap.put("2", "ether@email.com");
        multimap.put("3", "hacker@hotmail.com");
        multimap.put("4", "etheria@hotmail.com");
        System.out.println(multimap.asMap());
        System.out.println(multimap.entries());
        System.out.println(multimap.keys());
        System.out.println(multimap.values());
        System.out.println(multimap.keySet());

    }
}
