import java.util.*;

/**
 * @author Alex T. H.
 */
public class ExamplesArrayList{
    /**
     * Principales caracteristicas de un ArrayList:
     * ArrayList puede contener elementos duplicados, podríamos decir que esta es la clase más importante.
     * ArrayList tiene acceso aleatorio debido a que el array trabaja con una base de índices.
     * Se mantiene el orden en la insercción.
     * No permite uso de synchronized.
     * El acceso a un ArrayList va a ser más lento que los accesos a LinkedList.
     * Hay que tener en cuenta que no se permite crear ArrayList de tipos primitivos.
     * ArrayList extiende de AbstractList e implementa la interfaz List.
     */

//    Tenemos 3 diferentes maneras de instancion un ArrayList
    public static void main(String[] args) {
//     Creacion de un ArrayList vacio
        ArrayList list = new ArrayList();

//     Creacion de un ArrayList con un tamaño
        var size = 10;
        ArrayList listWithSize = new ArrayList(size);


//      Contruccion de un ArrayList con el tipe de Elemento
//        public ArrayList(Collection<? extends E> c);

//      Podemos usar Byte porque es de tipo Objeto basado en los Tipos de Datos primitivos
        byte code = 5;
        ArrayList<Byte> test = new ArrayList<>();
        test.add(code); // metodo para agregar un elemento
        test.add((byte) 10); // metodo para agregar un elemento
        test.add(3, (byte) 9); // metodo para agregar un elemento en un indice especifico


        byte element = test.get(1); // metodo para obtener un elemento en base al indice
        System.out.println(test.get(1));

    }
}
