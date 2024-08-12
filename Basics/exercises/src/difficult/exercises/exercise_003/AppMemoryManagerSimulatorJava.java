package difficult.exercises.exercise_003;

/**
 * Exercise 003
 *
 * @author Alex T.H.
 * @version v0.5.2
 * @since 21.0.0 2024-08-12
 */
public class AppMemoryManagerSimulatorJava {
    public static void main(String[] args) {
        System.out.println("App Memory Manager Simulator of Java");

        RamHeap heap = new RamHeap();
        heap.setObject("Juan");
        heap.setObjectHexadecimal();
        heap.setReferencesRamHeap();
        System.out.println("RAM HEAP");
        System.out.println(heap.getReferencesRamHeap());

        RamStack stack = new RamStack();
        stack.setVariableName("name");
        stack.setMemoryReference();
        stack.setReferenceRamHeap(heap.getObjectHexadecimal());
        stack.setReferencesStack();
        System.out.println("RAM STACK");
        System.out.println(stack.getReferencesStack());

        // Simulate search of Variable
        String search = (String) heap.getReferencesRamHeap()
                .getFirst()
                .get(
                stack.getReferencesStack()
                    .getFirst()
                    .get("name")
                    .split(" ")[0]);

        System.out.println(search);

    }
}
