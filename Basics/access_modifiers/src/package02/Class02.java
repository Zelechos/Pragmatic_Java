package package02;

import package01.Class01;

class Class02 extends Class01 {

    String defaultAttribute = "valor de atributo por defecto";

    Class02() {
        super();
        this.protectedAttribute = "modificando el atributo protegido";
        System.out.println(this.protectedAttribute);
        this.protectedMethod();
    }

    void defaultMethod() {
        System.out.println("metodo por defecto");
    }


}
