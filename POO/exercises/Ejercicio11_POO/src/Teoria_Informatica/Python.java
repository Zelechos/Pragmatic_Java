package Teoria_Informatica;

public class Python extends Lenguajes_de_Programacion {

    protected String Nombre3;
    protected String info3;

    public Python(String Info) {
        super(Info);
        this.Nombre3 = "Python : ";
        this.info3 = "¿Qué es Python?\n"
                + "Python es un lenguaje de programación de alto nivel multiparadigma que permite:\n"
                + "\n"
                + "Programación imperativa\n"
                + "Programación funcional\n"
                + "Programación orientada a objetos\n"
                + "Fue creado por Guido van Rossum en 1990 aunque actualmente es desarrollado y mantenido por la Python Software Foundation\n"
                + "\n"
                + "Principales ventajas de Python\n"
                + "Es de código abierto (certificado por la OSI).\n"
                + "Es interpretable y compilable.\n"
                + "Es fácil de aprender gracias a que su sintaxis es bastante legible para los humanos.\n"
                + "Es un lenguaje maduro (29 años).\n"
                + "Es fácilmente extensible e integrable en otros lenguajes (C, java).\n"
                + "Esta mantenido por una gran comunidad de desarrolladores y hay multitud de recursos para su aprendizaje.\n"
                + "Tipos de ejecución\n"
                + "Interpretado en la consola de Python\n"
                + "Se ejecuta cada instrucción que introduce el usuario de manera interactiva.\n"
                + "\n"
                + "> python\n"
                + ">>> name = \"Alf\"\n"
                + ">>> print(\"Hola \", name)\n"
                + "Hola Alf\n"
                + "Interpretado en fichero\n"
                + "Se leen y se ejecutan una a una todas las instrucciones del fichero.\n"
                + "\n"
                + "# Fichero hola.py\n"
                + "name = \"Alf\"\n"
                + "print(\"Hola \", name)\n"
                + "> python hola.py\n"
                + "Hola Alf\n"
                + "También se puede hacer el fichero ejecutable indicando en la primera línea la ruta hasta el intérprete de Python.\n"
                + "\n"
                + "#!/usr/bin/python3\n"
                + "name = \"Alf\"\n"
                + "print(\"Hola\", name)\n"
                + "> chmod +x hola.py\n"
                + "> ./hola.py\n"
                + "Hola Alf\n"
                + "Compilado a bytecode\n"
                + "# Fichero hola.py\n"
                + "name = \"Alf\"\n"
                + "print(\"Hola \" + name)\n"
                + "> python -O -m py_compile hola.py\n"
                + "> python __pycache__/hola.cpython-37.pyc\n"
                + "Hola Alf\n"
                + "Compilado a ejecutable del sistema\n"
                + "Hay distintos paquetes que permiten compilar a un ejecutable del sistema operativo usado, por ejemplo pyinstaller.\n"
                + "\n"
                + "> conda install pyinstaller\n"
                + "> pyinstaller hola.py\n"
                + "> ./dist/hola/hola\n"
                + "Hola Alf";

    }

    public String getNombre3() {
        return Nombre3;
    }

    public String getInfo3() {
        return info3;
    }

}
