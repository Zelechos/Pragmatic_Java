package Teoria_Informatica;

public class JavaScript extends Lenguajes_de_Programacion {

    protected String Nombre4;
    protected String info4;

    public JavaScript(String Info) {
        super(Info);
        this.Nombre4 = "JavaScript : ";
        this.info4 = "¿Qué debe conocer previamente?\n"
                + "Esta guía presupone que tiene los siguientes conocimientos básicos:\n"
                + "\n"
                + "Un entendimiento general del Internet y de la World Wide Web (WWW).\n"
                + "Buen conocimiento práctico del lenguaje de marcado HTML (HyperText Markup Language) (HTML).\n"
                + "Alguna experiencia en programación. Si es nuevo en este tema, vea uno de los tutoriales  sobre JavaScript enlazados en la página principal.\n"
                + "Dónde encontrar información sobre  JavaScript\n"
                + "La documentación JavaScript en MDN incluye lo siguiente:\n"
                + "\n"
                + "Aprendiendo la Web proporciona información para principiantes y presenta conceptos básicos de programación y de Internet.\n"
                + "Guia JavaScript (esta guía) proporciona un vistazo sobre el lenguaje JavaScript y sus objetos.\n"
                + "Referencia JavaScript proporciona material detallado de referencia para JavaScript.\n"
                + "Si es nuevo en JavaScript, comience con los articulos en el área de aprendizaje y la Guía JavaScript. Cuando tenga un buen conocimiento de "
                + "\n los fundamentos, puede usar la Referencia JavaScript para conseguir más detalles de objetos y declaraciones individuales:\n"
                + "\n"
                + "¿Qué es JavaScript?\n"
                + "JavaScript es un lenguaje de scripting multiplataforma y orientado a objetos. Es un lenguaje pequeño y liviano. Dentro de un ambiente de host, "
                + " \nJavaScript puede conectarse a los objetos de su ambiente y proporcionar control programático sobre ellos.\n"
                + "\n"
                + "JavaScript contiene una librería estándar de objetos, tales como  Array, Date, y Math, y un conjunto central de elementos del lenguaje, tales como operadores, estructuras de control, y sentencias. "
                + "\nEl núcleo de JavaScript puede extenderse para varios propósitos, complementándolo con objetos adicionales, por ejemplo:\n"
                + "\n"
                + "Client-side JavaScript extiende el núcleo del lenguaje proporcionando objetos para controlar un navegador y su modelo de objetos (o DOM, por las iniciales de Document Object Model). Por ejemplo, las extensiones del lado del cliente permiten que una aplicación coloque elementos en un formulario "
                + "\nHTML y responda a eventos del usuario, tales como clicks del ratón, ingreso de datos al formulario y navegación de páginas.\n"
                + "Server-side JavaScript extiende el núcleo del lenguaje proporcionando objetos relevantes a la ejecución de JavaScript en un servidor. Por ejemplo, "
                + "\nlas extensiones del lado del servidor permiten que una aplicación se comunique con una base de datos, proporcionar continuidad de la información de una invocación de la aplicación a otra, o efectuar manipulación de archivos en un servidor.\n"
                + "JavaScript y Java\n"
                + "JavaScript y Java son similares en algunos aspectos, pero fundamentalmente diferentes en otros. El lenguaje JavaScript se parece a Java pero no tiene el tipo estático (static) de Java,"
                + "\n ni tiene un chequeo de tipos fuerte. JavaScript usa la mayoría de la sintaxis de expresiones de Java, convenciones de nombrado, y las construcciones básicas de control de flujo, razón por la cual se le cambió el nombre del original LiveScript a JavaScript.\n"
                + "\n"
                + "En contraste con el sistema de clases construidas por declaraciones que se usa en tiempo de compilación de Java, "
                + "\nJavaScript soporta un sistema de tiempo de ejecución basado en un pequeño número de tipos de datos que representan valores numéricos, lógicos, y de cadena de caracteres (string). JavaScript tiene un modelo de objetos basado en prototipos en lugar del  modelo de objetos basado en clases, que es más común. El modelo basado en prototipo proporciona herencia dinámica; esto es, que lo que se hereda puede variar entre objetos individuales. JavaScript también soporta funciones sin ningun requerimiento declarativo especial. Las funciones pueden ser propiedades de los objetos, ejecutándose como métodos levemente tipados.\n"
                + "\n"
                + "Comparado con Java, JavaScript es un lenguaje muy libre de forma. No hay que declarar todas las variables, clases, y métodos. No hay que preocuparse de si los métodos son públicos, privados, o protegidos, "
                + "\n y no hay que implementar interfases. Las variables, parámetros, y retornos de funciones no tienen que declararse explícitamente de un tipo dado.\n"
                + "\n"
                + "Java es un lenguaje de programación basado en clases, diseñado para lograr seguridad de tipos, y ejecución rápida. Seguridad de tipos significa, por ejemplo, que no es posible hacer una conversión de tipos a un Integer de Java para obtener una referencia a un objeto, o acceder a memoria protegida mediante la alteración del bytecode de una clase. El modelo basado en clases de Java implica  en que los programas consisten exclusivamente en clases y sus métodos. La herencia de clases de Java y el tipado fuerte generalmente requiere que jerarquías de objetos fuertemente acopladas. Estos requerimientos hacen que la programación en Java sea más compleja que la programación en JavaScript.\n"
                + "\n"
                + "En contraposición, JavaScript proviene en espíritu de una línea de lenguajes de programación más pequeños, con tipado dinámico, como HyperTalk, y dBASE. Estos lenguajes de scripting hacen accesibles las herramientas de programación a audiencias mucho más amplias. Esto se debe a su sintaxis más indulgente, funcionalidad especializada ya incluida, y mínimos requisitos para la creación de objetos.\n"
                + "\n"
                + "JavaScript en comparación a Java\n"
                + "JavaScript	Java\n"
                + "Orientado a objetos. Sin distinción entre tipos de objetos. La herencia se modela mediante el mecanismo de prototipado, y es posible añadir propiedades y métodos a cualquier objeto de forma dinámica.	Basado en clases. Los objetos se dividen en clases e instancias. Toda la herencia está sujeta a una jerarquía de clases. Las clases e instancias no pueden obtener nuevas propiedades o métodos de forma dinámica.\n"
                + "No se declaran los tipos de datos de las variables (tipado dinámico).	Los tipos de datos de las variables deben ser declarados (tipado estático).\n"
                + "No se puede escribir automáticamente en el disco duro.	No se puede escribir automáticamente en el disco duro.\n"
                + "Para más información sobre las diferencias entre JavaScript y Java, vea el capitulo Details of the object model.\n"
                + "\n"
                + "JavaScript y la especificación ECMAScript\n"
                + "JavaScript está estandarizado en Ecma International — la asociación europea  para la creación de estándares para la comunicación y la información (ECMA originalmente era un acrónimo: European Computer Manufacturers Association). con el fin de ofrecer un lenguaje de programación estandarizado e internacional, basado en Javascript. Esta versión de JavaScript, llamada ECMAScript, se comporta de la misma manera en todas las aplicaciones que implementan el estándar. Cualquier compañía puede usar el lenguaje basado en estándares abiertos, para desarrollar su implementación de JavaScript. El estándar ECMAScript está documentado en la especificación ECMA-262. Vea New in JavaScript para conocer más acerca de las diferentes versiones de JavaScript y ediciones de la especificación ECMAScript.\n"
                + "\n"
                + "El estándar ECMA-262 también está aprobado por ISO (Organización Internacional de Normalización), como ISO-16262. También se puede encontrar la especificación en el sitio de Ecma International. La especificación ECMAScript no describe el Document Object Model (DOM), que está estandarizado por el World Wide Web Consortium (W3C). El DOM define la forma como los objetos de los documentos HTML se exponen a sus scripts. Para tener una mejor idea acerca de las diversas tecnologías que se usan al programar con JavaScript, consulte el artículo  JavaScript technologies overview.\n"
                + "\n"
                + "Documentación de JavaScript  versus especificación de ECMAScript\n"
                + "La especificación ECMAScript es un conjunto de requisitos para la implementación de ECMAScript; es util si desea implementar las caracteristicas del lenguaje compatible con los estándares en la implementación ECMAScript o motor (como SpiderMonkey en Firefox, o v8 en Chrome).\n"
                + "\n"
                + "La documentación ECMAScript no esta destinado a ayudar a los programadores de script; utilizar la documentación JavaScript para la información sobre la escritura de scripts.\n"
                + "\n"
                + "La especificación ECMAScript utiliza terminología y sintaxis que puede ser desconocida para un programador de JavaScript. Aunque la descripción del lenguaje puede variar en ECMAScript, el lenguaje sigue siendo el mismo. JavaScript soporta toda la funcionalidad se indica en la especificación ECMAScript.\n"
                + "\n"
                + "La documentación JavaScript describe los aspectos del lenguaje que son apropiados para el programador JavaScript.\n"
                + "\n"
                + "Como empezar con JavaScript\n"
                + "Empezar con JavaScript es fácil: todo lo que necesitas es un navegador moderno. Esta guía incluye algunas características que solo están disponibles en las últimas versiones de Firefox, así que se recomienda usar la versión más reciente de Firefox.\n"
                + "\n"
                + "Hay dos herramientas integradas en Firefox que son útiles para experimentar con JavaScript: la Consola Web y el Borrador.\n"
                + "\n"
                + "La Consola Web\n"
                + "La Consola Web muestra información sobre la página web que se está ejecutando en ese momento, y también incluye la línea de comando que puedes usar para ejecutar expresiones JavaScript en la página actual.\n"
                + "\n"
                + "Para abrir la Consola Web, seleccionar \"Consola web\" desde el menú \"Desarrollador web\" que se encuentra en el menú \"Herramientas\" en Firefox. Aparece en la parte inferior de la ventana del navegador. A lo largo de la parte inferior de la consola está la línea de comando que puede utilizar para ejecutar JavaScript, y el resultado aparece en el panel de arriba:\n"
                + "\n"
                + "\n"
                + "\n"
                + "Borrador\n"
                + "La Consola Web es genial para ejecutar sencillas líneas en JavaScript, pero aunque se pueden ejecutar múltiples líneas, no es muy conveniente para esto, y no puedes guardar tus ejemplos de código usando la Consola Web. Así que para los ejemplos más complejos el Borrador es la mejor herramienta.\n"
                + "\n"
                + "Para abrir el Borrador, selecciona \"Borrador\" desde el menú \"Desarrollador Web\", que se encuentra en el menú de \"Herramientas\" en Firefox. Abre una nueva ventana y es un editor que puedes usar para escribir y ejecutar JavaScript en el navegador. Puedes también guardar los scripts en el disco  y cargarlos desde el disco.\n"
                + "\n"
                + "Si eliges \"Mostrar\", el bloque de su código es ejecutado en el navegador y el resultado es insertado de nuevo dentro del bloque como un comentario:\n"
                + "\n"
                + "\n"
                + "\n"
                + "Hola Mundo\n"
                + "Para empezar a escribir con JavaScript, abre la Consola Web o el Borrador y escribe tu primer código JavaScript \"Hola Mundo\".\n"
                + "\n"
                + "//Declaramos una funcion llamada saludar, que lleva\n"
                + "//'nombre' como argumento.\n"
                + "function saludar(nombre) {\n"
                + "  return \"Hola \" + nombre; //Cuando se llama, esta funcion devuelve \"Hola \" y el nombre que se le ha pasado como argumento.\n"
                + "}\n"
                + "\n"
                + "saludar(\"Usuario\"); // Nos devolvera \"Hola Usuario\".\n"
                + "En las siguientes páginas, esta guía le dará a conocer la sintaxis y características del lenguaje de JavaScript, por lo que va a ser capaz de escribir aplicaciones más complejas.";
    }

    public String getNombre4() {
        return Nombre4;
    }

    public String getInfo4() {
        return info4;
    }

}
