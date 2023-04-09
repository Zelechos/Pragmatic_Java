package collections_concepts;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

//    La interface List hereda de la interface Collections

//    Ejemplo de como usar la interfaz List

//  esta lista es de Tipo Object ya que no se definio por defect el tipo de List

//  tambien mantiene el orden en el que los elementos fueron introducidos y puede tener elementos repetidos
        List simpleList = new ArrayList<>();
        CollectionsSubrutines.elementFactory(simpleList);
        CollectionsSubrutines.addElement(simpleList, 9);

//  como se puede apreciar se puede agregar cualquier dato dado que todos heredan de Object

        System.out.println("---------------------------------------------------");
        CollectionsSubrutines.showCollection(simpleList);

    }
}
