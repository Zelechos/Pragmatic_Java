package collections_concepts;

import java.util.Collection;
import java.util.Scanner;

public class CollectionsSubrutines {

    public static void elementFactory(Collection collection) {
        collection.add("i am a string");
        collection.add(9);
        collection.add(true);
        collection.add(new Scanner(System.in));
    }

    public static void addElement(Collection collection, Object object) {
        collection.add(object);
    }

    public static void showCollection(Collection collection) {
        collection.forEach(element -> System.out.println(element));
    }
}
