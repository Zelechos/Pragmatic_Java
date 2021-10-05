package Teoria_Informatica;

public class Java extends Lenguajes_de_Programacion {

    protected String Nombre1;
    protected String Info1;

    public Java(String Info) {
        super(Info);
        this.Nombre1 = "JAVA : ";
        this.Info1 = " Java es un lenguaje de programación de propósito general, tipado, orientado a objetos,… que permite el desarrollo desde aplicaciones básicas, pasando por aplicaciones empresariales hasta aplicaciones móviles.\n"
                + "\n"
                + "Java nacía como un lenguaje de programación que pudiese ser multiplataforma y multidispositivo, bajo el paradigma “Write Once Run Anywhere” (WORA)\n"
                + "\n"
                + "De esta forma un programa Java escrito una vez podemos ejecutarle sobre diferentes plataformas, siendo soportados los sistemas operativos Windows, MacOs y UNIX. Y a su vez en diferentes tipos de dispositivos.\n"
                + "\n"
                + "Para poder seguir este paradigma la compilación de un programa Java no genera código fuente, si no que genera bytecodes. Estos bytecodes son interpretados por una máquina virtual o JVM (Java Virtual Machine). Dicha máquina ya está escrita para cada uno de los sistemas operativos en cuestión.\n"
                + "\n"
                + "Características del lenguaje Java\n"
                + "Dentro de las características del lenguaje Java encontramos:\n"
                + "\n"
                + "Independiente de Plataforma\n"
                + "Cuando compilamos código fuente Java no se genera código máquina específico, si no que se generan bytecodes, los cuales son interpretados por la Java Virtual Machine (JVM), posibilitando que un mismo código fuente pueda ser ejecutado en múltiples plataformas.\n"
                + "\n"
                + "Orientado a Objetos\n"
                + "Cualquier elemento del lenguaje Java es un objeto. Dentro de los objetos se encapsulan los datos, los cuales son accedidos mediante métodos.\n"
                + "\n"
                + "Sencillo\n"
                + "Java está enfocado para ser un lenguaje fácil de aprender. Simplemente se deberán de entender los conceptos básicos de la programación orientada a objetos (POO).\n"
                + "\n"
                + "Seguro\n"
                + "Es seguro ya que los programas se ejecutan dentro de la Java Virtual Machine (JVM) en un formato de “caja de arena”, de tal manera que no pueden acceder a nada que esté fuera de ella.\n"
                + "\n"
                + "Tiene una validación sobre los bytecodes para comprobar que no hay códigos de fragmento ilegal.\n"
                + "\n"
                + "Arquitectura Neutral\n"
                + "Independientemente de que se ejecute en una arquitectura de 32bits o de 64bits. En Java los tipos de datos siempre ocupan lo mismo.\n"
                + "\n"
                + "Portable\n"
                + "Java no tiene nada que dependa de la plataforma, lo cual le hace que sea portable a diferentes plataformas.\n"
                + "\n"
                + "Robusto\n"
                + "El lenguaje Java intenta controlar las situaciones de error en los procesos de compilación y de ejecución, reduciendo de esta manera el riesgo de fallo.\n"
                + "\n"
                + "Además Java realiza el control total de la memoria alocándola y retirandola mediante un garbage colletor, de tal manera que no podemos utilizar punteros para acceder a ella.\n"
                + "\n"
                + "Multi-hilo\n"
                + "Java nos permite la programación concurrente, de tal manera que un único programa puede abrir diferentes hilos de ejecución.\n"
                + "\n"
                + "Interpretado\n"
                + "Los bytecodes son interpretados en tiempo real a código máquina.\n"
                + "\n"
                + "Alto Rendimiento\n"
                + "Java ofrece compiladores Just-In-Time que permiten tener un alto rendimiento.\n"
                + "\n"
                + "Distribuido\n"
                + "El lenguaje Java está pensando para ser ejecutado en arquitecturas distribuidas, como pueda ser Internet.\n";
    }

    public String getNombre1() {
        return Nombre1;
    }

    public String getInfo1() {
        return Info1;
    }

    
    
    
}
