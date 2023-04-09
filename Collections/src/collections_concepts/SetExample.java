package collections_concepts;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

//      A la hora de insertar elementos lo inserta de manera desordenada
//      un Set no puede tener elementos duplicados
        Set simpleSet = new HashSet();
        CollectionsSubrutines.elementFactory(simpleSet);
        CollectionsSubrutines.addElement(simpleSet, 9);
        CollectionsSubrutines.showCollection(simpleSet);
    }
}
