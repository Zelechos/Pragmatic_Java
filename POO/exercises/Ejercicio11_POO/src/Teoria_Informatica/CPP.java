package Teoria_Informatica;

public class CPP extends Lenguajes_de_Programacion {
    
    protected String Nombre2;
    protected String info2;
    
    public CPP(String Info) {
        super(Info);
        this.Nombre2 = "C++ : ";
        this.info2 = "Los programas de ordenador\n"
                + "Es posible que usted nunca haya oído hablar de conceptos como compilación, ejecutables, etc. No se trata de detallar aquí los mecanismos por los cuales un código escrito en un lenguaje de programación se convierte en un programa que hace ciertas cosas en un ordenador. El tema es en sí mismo motivo de libros. Sin embargo, sí que es interesante explicar cómo se obtiene un programa a partir de un código.\n"
                + "\n"
                + "Para obtener un programa que se pueda ejecutar en un ordenador se necesita un código fuente, es decir, un archivo de texto con las instrucciones. Este archivo suele tener la extensión cpp y es el que usted tiene que escribir como programador. También son necesarios unos archivos de cabecera con la extensión h; de éstos, algunos serán escritos por el programador, pero otros ya vienen con el compilador. Con todos los archivos se realiza el proceso de compilación que da como resultado un archivo de extensión obj.\n"
                + "\n"
                + "El código que el programador escribe lo entienden las personas, pero no la máquina. El ordenador tiene su propio lenguaje formado por unos y ceros, que es complicado para las personas. Entonces, qué se entiende por compilación. Pues simplemente la traducción de todas las instrucciones al idioma de la máquina. El programador se libera del complicado lenguaje de la máquina… y se concentra en el lenguaje de programación mucho más cercano a la forma de pensar de los humanos.\n"
                + "\n"
                + "Finalmente, antes de obtener el ejecutable es necesario un linkaje que enlaza el archivo obj con las librerías que suministra el lenguaje. La mezcla del archivo obj con las librerías .lib conducen a un ejecutable exe. Este último archivo es el que se podrá ejecutar en la máquina.\n"
                + "\n"
                + "Hoy en día, hay entornos de programación que realizan está labor en un conjunto integrado, posiblemente usted trabaje con uno de ellos. En tal caso le remitimos al manual de instrucciones para compilar y ejecutar un archivo. En general, de todas las funcionalidades que tienen esos entornos usted sólo va a necesitar unas pocas; por lo tanto le aconsejamos que no pierda mucho el tiempo en aprender su manejo hasta que realmente no necesite hacer cosas muy potentes.\n"
                + "\n"
                + "Trabaje con un único archivo cpp y a lo sumo un archivo h, el resto lo pone todo el entorno, Construya y ejecute las aplicaciones, no necesita nada más.\n"
                + "\n"
                + "Esquema del proceso de compilación y linkado para obtener un ejecutable.\n"
                + "\n"
                + "Consideraciones Generales\n"
                + "C es lenguaje de “funciones” à por ejemplo la función “main()”. Como función debe tener uno o más argumentos. Puede ocurrir que ese argumento sea vacío.\n"
                + "En C todas las funciones  se escriben en minúsculas, salvo algunas excepciones.\n"
                + "C hace distinción entre minúsculas y mayúsculas, de tal manera que el identificador Hola es distinto de hola, distinto de hOla, distinto de hoLa, etc.\n"
                + "Toda instrucción termina con un punto y coma (;)\n"
                + "C es un lenguaje de bloques. Dos o más instrucciones son un bloque que comienza con la apertura de una llave ({) y termina con el cierre de una llave (}).\n"
                + "Se abre una llave… se cierra una llave, análogamente se abre un paréntesis… se cierra un paréntesis, etc.\n"
                + "El Entorno Integrado de Desarrollo (EID) nos permite trabajar con “indentación”… se debe trabajar en forma indentada\n"
                + "Es responsabilidad del programador NO excederse en el rango máximo permitido para el tipo de identificador declarado!!!!!! Por ejemplo, si declaro un int el valor máximo permitido es 32767.\n"
                + "Deben inicializarse todos y cada uno de los acumuladores, porque el compilador NO los inicializa.\n"
                + " \n"
                + "\n"
                + "Un programa sencillo\n"
                + "La mejor manera de empezar el estudio de C++ es examinar un programa. Comenzaremos con el programa más simple que puede escribirse en C++:  1PRIMERO.CPP\n"
                + "\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n"
                + "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "#include <iostream.h>\n"
                + " \n"
                + "main()\n"
                + " \n"
                + "{\n"
                + " \n"
                + "cout <<\"Esta es una línea de texto.\";\n"
                + " \n"
                + "}\n"
                + "La palabra «main» es muy importante, y debe aparecer una vez y sólo una en cualquier programa en C++. Este es el punto de partida desde el cual el programa se ejecuta.\n"
                + "\n"
                + "Siguiendo a la palabra «main», hay un par de paréntesis en la forma (), que le indican al compilador que está ante una función.\n"
                + "\n"
                + "Los signos de llave, conocidos como símbolos de agrupamiento, agrupan las declaraciones relacionadas, se usan para definir los límites del programa principal.\n"
                + "\n"
                + "El punto y coma de final de línea es usado como mandato finalizador, por tanto el compilador asigna a este caracter la función de indicar que la línea ya está completa.\n"
                + "\n"
                + "La declaración  #include\n"
                + "Esta declaración indica al compilador que incluya el contenido del archivo especificado al principio del programa. En este caso, el compilador incluirá el contenido del archivo iostream.h. Los archivos que tienen extensión h y se incluyen al principio (o cabecera) de los programas se llaman archivos de cabecera.\n"
                + "\n"
                + "Cada uno de los archivos de cabecera comprende definiciones que el compilador proporciona para diferentes operaciones. Por ejemplo, hay archivos de cabecera  para las operaciones matemáticas, para operaciones con archivos, y otros. Por ahora no nos preocuparemos mucho por los archivos de cabecera, simplemente tengamos en cuenta que la declaración #include nos deja utilizarlos.\n"
                + "\n"
                + " \n"
                + "\n"
                + "La consola\n"
                + "El instrumento más rudimentario de interacción es la consola, es decir, el teclado para permitir la interacción hombre-máquina y la pantalla para la relación inversa. En la librería <iostream.h> hay definidos cuatro elementos de interacción.\n"
                + "\n"
                + "cout    Salida por pantalla.\n"
                + "\n"
                + "cin      Entrada por el teclado.\n"
                + "\n"
                + "cerr    Salida de error por pantalla.\n"
                + "\n"
                + "Los operadores « y », son los llamados operadores de inserción y de extracción respectivamente, sirven para dirigir el flujo de datos.\n"
                + "\n"
                + "La salida se realiza a través del operador « y consiste en insertar los datos en el stream, en particular se convierte en salida por la pantalla. Lo mismo ocurre con la entrada, el operador » saca del stream el tipo de dato necesario.\n"
                + "\n"
                + "El operador cout\n"
                + "El operador cout muestra por pantalla lo que se encuentra entre comillas. Se utiliza con el doble signo de menor que “<<“, llamado operador de inserción.\n"
                + "\n"
                + "A continuación veremos un programa pequeño, pero que ilustra un concepto muy importante: 2SEGUNDO.CPP\n"
                + "\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n"
                + "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "10\n"
                + "11\n"
                + "12\n"
                + "13\n"
                + "14\n"
                + "15\n"
                + "#include <iostream.h>\n"
                + " \n"
                + "main()\n"
                + " \n"
                + "{\n"
                + " \n"
                + "cout <<\"Esta es una línea de texto.\\n\";\n"
                + " \n"
                + "cout <<\"Y esta es otra \";\n"
                + " \n"
                + "cout <<\"línea de texto.\\n\\n\";\n"
                + " \n"
                + "cout <<\"Esta es la tercera línea.\";\n"
                + " \n"
                + "}\n"
                + "El programa consta de cuatro declaraciones. Se ejecutan las líneas por orden de encuentro, por lo tanto se ejecutará la línea superior en primer lugar, después la segunda, tras ésta la tercera y así sucesivamente. El programa se ejecuta de arriba a abajo.\n"
                + "\n"
                + "Cerca del fin de la primera línea aparece el  llamado «caracter de corte: \\ «. Se usa para indicar que le sigue un caracter de control especial. En este caso, ese caracter es «n«, que indica que se ejecutará una nueva línea. Esta indicación hace que el cursor baje una línea y se coloque en la primera posición izquierda de la pantalla. Se refiere normalmente a un retorno de carro. En cualquier parte del texto, donde se desee, puede acabar la línea y empezar otra nueva. Se puede cortar una palabra y mostrarla entre dos líneas. El compilador considera la expresión «\\n» como un solo caracter (caracter de corte+letra n). Entonces, el primer cout muestra una línea de texto, y realiza un retorno de carro. La segunda línea muestra una línea de texto, sin retorno de carro, porque la tercera efectúa 2 retornos de carro, resultando una línea en blanco. Finalmente la cuarta línea muestra otra línea de texto y acaba el programa.\n"
                + "\n"
                + " \n"
                + "\n"
                + "IDENTIFICADORES\n"
                + "Un identificador es una combinación de caracteres numéricos, alfanuméricos o letras, o algún número, o un caracter subrayado “_”, lo usa una variable, o una función, o una definición de datos, etc. En el lenguaje C++ debe tenerse en cuenta que mayúsculas y minúsculas definen identificadores distintos. Así, el identificador “INDICE”, es distinto de “indice”, y también de “Indice”.\n"
                + "\n"
                + "Declaración de variables\n"
                + "Los programas usan variables para almacenar información. Dependiendo de la clase de valor que se quiera guardar, tal como un número entero, una letra del alfabeto o un valor de punto flotante, diferirá el tipo de la variable. La mayoría de los programas en C++ utilizarán los tipos de variables citados en las siguientes tablas:\n"
                + "\n"
                + "Tipos Básicos:\n"
                + "\n"
                + "Tipo\n"
                + "\n"
                + "Ancho en Bit\n"
                + "\n"
                + "Ancho en Bytes\n"
                + "\n"
                + "Rango\n"
                + "\n"
                + "char\n"
                + "\n"
                + "8\n"
                + "\n"
                + "1\n"
                + "\n"
                + "0 a 255\n"
                + "\n"
                + "int\n"
                + "\n"
                + "16\n"
                + "\n"
                + "2\n"
                + "\n"
                + "-32768 a 32767\n"
                + "\n"
                + "float\n"
                + "\n"
                + "32\n"
                + "\n"
                + "4\n"
                + "\n"
                + "-3.4E-38 a 3.4E+38\n"
                + "\n"
                + "double\n"
                + "\n"
                + "64\n"
                + "\n"
                + "8\n"
                + "\n"
                + "(por las dudas este no tiene que ser-)1.7E-308 a 1.7E+308\n"
                + "\n"
                + "void\n"
                + "\n"
                + "0\n"
                + "\n"
                + "0\n"
                + "\n"
                + "sin valor\n"
                + "\n"
                + "Otros:\n"
                + "\n"
                + "Tipo\n"
                + "\n"
                + "Ancho en Bit\n"
                + "\n"
                + "Ancho en Bytes\n"
                + "\n"
                + "Rango\n"
                + "\n"
                + "signed char\n"
                + "\n"
                + "8\n"
                + "\n"
                + "1\n"
                + "\n"
                + "-128 a 127 (como -?)\n"
                + "\n"
                + "unsigned int\n"
                + "\n"
                + "16\n"
                + "\n"
                + "2\n"
                + "\n"
                + "0 a 65535\n"
                + "\n"
                + "long int\n"
                + "\n"
                + "32\n"
                + "\n"
                + "4\n"
                + "\n"
                + "-2147483648 a 214.782.647\n"
                + "\n"
                + "unsigned long int\n"
                + "\n"
                + "32\n"
                + "\n"
                + "4\n"
                + "\n"
                + "0 a 4.294.967.295\n"
                + "\n"
                + "unsigned short int\n"
                + "\n"
                + "16\n"
                + "\n"
                + "2\n"
                + "\n"
                + "-32768 a 32767\n"
                + "\n"
                + "Antes de que se pueda utilizar una variable hay que declararla, introducirla en el programa.\n"
                + "\n"
                + "En la declaración se especifica el tipo de variable y su nombre.\n"
                + "\n"
                + "Cuando se declara más de una variable del mismo tipo, C++ permite separar los nombres de las variables utilizando una coma.\n"
                + "\n"
                + "Cada variable tiene un nombre único. Para que los programas sean más fáciles de leer y comprender deben utilizarse nombres significativos para las variables.\n"
                + "\n"
                + " \n"
                + "\n"
                + "Una vez declarada la variable se utiliza el operador de asignación (el signo igual) del C++ para asignar un valor a una variable.\n"
                + "\n"
                + "Cuando se declara una variable suele ser conveniente asignar el valor inicial de la misma. Para facilitar las cosas, C++ permite asignar valores al mismo tiempo que se declaran las variables.\n"
                + "\n"
                + "Después de asignar un valor a una variable, los programas pueden utilizar el valor de la misma haciendo referencia simplemente a su nombre.\n"
                + "\n"
                + "El siguiente programa, 3VARIABLE.CPP, asigna valores a dos variables y luego las exhibe en la pantalla utilizando el operador cout.\n"
                + "\n"
                + "El operador de inserción (<<) comunica al sistema que lo sigue una variable o una constante.\n"
                + "\n"
                + "1\n"
                + "2\n"
                + "3\n"
                + "4\n"
                + "5\n"
                + "6\n"
                + "7\n"
                + "8\n"
                + "9\n"
                + "10\n"
                + "11\n"
                + "12\n"
                + "13\n"
                + "14\n"
                + "15\n"
                + "16\n"
                + "17\n"
                + "18\n"
                + "19\n"
                + "20\n"
                + "21\n"
                + "22\n"
                + "23\n"
                + "24\n"
                + "25\n"
                + "26\n"
                + "27\n"
                + "#include <iostream.h>\n"
                + " \n"
                + "main()\n"
                + " \n"
                + "{         /* Principio\n"
                + " \n"
                + "del programa */\n"
                + " \n"
                + "&nbsp;\n"
                + " \n"
                + "int edad;                     //Declaración de la variable\n"
                + " \n"
                + "float salario = 451.75;  //Declaración y asignación\n"
                + " \n"
                + "&nbsp;\n"
                + " \n"
                + "edad=32;                             //Asignación del valor\n"
                + " \n"
                + "cout <<\"Edad del empleado: \" << edad << \" años \";\n"
                + " \n"
                + "cout <<\"\\nSalario: $\"<< salario << \".-\";\n"
                + " \n"
                + "&nbsp;\n"
                + " \n"
                + "// Fin del programa\n"
                + " \n"
                + "}\n"
                + "COMO HACER COMENTARIOS\n"
                + "En el programa anterior vemos dos maneras de hacer comentarios en un programa, para hacerlo más legible a otros. El compilador ignora estos comentarios.\n"
                + "\n"
                + "Una de las formas es utilizar la barra de división  y el signo de estrella, en la forma /* para iniciar un bloque de comentarios y la forma */ para finalizar el comentario.\n"
                + "\n"
                + "También se utiliza la doble barra “//”, que inicia un comentario en cualquier parte de una línea y termina automáticamente al final de ella. Este último método es el preferido para la definición de comentarios porque es imposible comentar inadvertidamente fuera de varias líneas del programa.  Esto podría ocurrir al usar el otro método de anotación de comentarios en C++, al olvidar incluir el fin de anotación de un comentario.\n"
                + "\n"
                + "Se debe destacar que no deberían  usarse los comentarios cuando el mismo sentido de la definición del programa puede ser obtenido usando nombres significativos para variables, constantes y funciones, por ello el programador debe seleccionar cuidadosamente los nombres de funciones y variables, esforzándose por perfeccionar su propio código.\n"
                + "\n"
                + "5\n"
                + "En: C / C++  c c++\n"
                + "\n"
                + "Acerca del autor: Rodrigo Paszniuk\n"
                + "Ingeniero Informático, amante de la tecnología, la música, el ciclismo y aprender cosas nuevas.\n"
                + "\n"
                + "Posts Relacionados\n"
                + " RPC (Remote Procedure Call) en C – Linux Sockets en C (Parte II) – Linux Sockets en C (Parte I) – Linux Pipes en C – Linux\n"
                + "Siguiente Post →← Anterior Post\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + " \n"
                + "\n"
                + "SEGUÍNOS EN FACEBOOK\n"
                + "\n"
                + "LOS MÁS VISTOS\n"
                + "Ejercicios resueltos en Ensamblador 8086\n"
                + "ARREGLOS Y CADENAS en C++\n"
                + "Ejemplos de programas en Ensamblador 8086\n"
                + "Arboles en C++\n"
                + "Pilas en C++\n"
                + "GITHUB\n"
                + "\n"
                + "\n"
                + " \n"
                + "\n"
                + "ACERCA DE\n"
                + "Programacion.com.py es un sitio web donde podrás encontrar recursos y documentación de distintos lenguajes de programación.\n"
                + "ENTRADAS RECIENTES\n"
                + "Crear API/WEB/CMS utilizando Ruby on Rails\n"
                + "SwiftUI: Que es y primeros pasos\n"
                + "Swift 5 llega a Xcode 10.2 Beta\n"
                + "Guía para crear una replicación en MariaDB\n"
                + "Usar Replicas de Bases de Datos en Ruby on Rails con la gema Octopus\n"
                + "ETIQUETAS\n"
                + "android angularjs c c++ cadenas CentOS delphi ensamblador express Express.js fedora funciones Git google hibernate HTML5 Java java ee Javascript jsp linux maven MONGODB mvc mysql Node.js nodejs phonegap php PostgreSQL rails red hat reportes rest ror ruby Ruby on Rails soap sockets sql server Swift ubuntu web service windows Yii\n"
                + "Frases 480StiloGamesTecnologia© 2020 PROGRAMACION.COM.PY - Design By Rodrigo Paszniuk     ";
    }
    
    public String getNombre2() {
        return Nombre2;
    }
    
    public String getInfo2() {
        return info2;
    }
    
}
