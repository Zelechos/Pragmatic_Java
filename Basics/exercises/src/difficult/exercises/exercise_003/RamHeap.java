package difficult.exercises.exercise_003;

import java.util.*;

/**
 * Exercise 003
 *
 * @author Alex T.H.
 * @version v0.5.2
 * @since 21.0.0 2024-08-12
 */
public class RamHeap implements MemoryAddress{

    private Object object;

    private String objectHexadecimal;

    private List<Map<String, Object>> referencesRamHeap;

    public RamHeap() {
    }

    public RamHeap(Object object, String objectHexadecimal, List<Map<String, Object>> referencesRamHeap) {
        this.object = object;
        this.objectHexadecimal = objectHexadecimal;
        this.referencesRamHeap = referencesRamHeap;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getObjectHexadecimal() {
        return objectHexadecimal;
    }

    public void setObjectHexadecimal() {
        this.objectHexadecimal = generateHexadecimalMemoryAddress() + this.object.hashCode();
    }

    public List<Map<String, Object>> getReferencesRamHeap() {
        return this.referencesRamHeap;
    }

    public void setReferencesRamHeap() {
        List<Map<String, Object>> listOfRefereces = new ArrayList<>();
        Map<String, Object> reference = new HashMap<>();
        reference.put(this.getObjectHexadecimal(), this.getObject());
        listOfRefereces.add(reference);
        this.referencesRamHeap = listOfRefereces;
    }

    @Override
    public String generateHexadecimalMemoryAddress() {
        return UUID.randomUUID().toString();
    }
}
