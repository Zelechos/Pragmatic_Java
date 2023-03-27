package blocks;

public class Person {

    private final int idPerson;
    private static int personCounter;

    //  bloque de inicializacion estatico se executa antes del constructor y el bloque no estatico
    //  este bloque de codigo se ejecuta la primera vez que se carga en memoria esta clase

    static {
//      dentro del bloque no se puede usar la palabra this
        System.out.println("Ejecucion bloque estatico");
        ++Person.personCounter;
    }

    //  bloque de inicializacion no estatico se executa antes del constructor
    //  este bloque de codigo se ejecuta cada vez que se crea un nuevo objeto
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPerson = Person.personCounter++;
    }


    public Person() {
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPerson(){
        return this.idPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                '}';
    }
}
