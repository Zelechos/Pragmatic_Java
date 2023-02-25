import java.lang.reflect.Method;

public class Connector {
    public static void main(String[] args) throws Exception {
//      Manera de Obtener el valor default de una Anotacion @Target(ElementType.METHOD)
        final Method[] methods = Class.forName(Connector.class.getName()).getMethods();
        for (Method method : methods) {
            Ethernet ethernetMethod = method.getAnnotation(Ethernet.class);
            if (ethernetMethod != null) {
                System.out.println(ethernetMethod.send());
            }
        }
        new Connector().disconnectEthernet();
        new Connector().ethernet();
        new Connector().hackedEthernet();
    }

    @Ethernet
    public void ethernet() {
    }

    @Ethernet(send = "ethernet disconnected")
    public void disconnectEthernet() {
    }

    @Ethernet(send = "ethernet hacked")
    public void hackedEthernet() {
        System.err.println("are you no programmer right?");
    }
}
