package difficult.exercises.exercise_003;

import java.util.*;

/**
 * Exercise 003
 *
 * @author Alex T.H.
 * @version v0.5.2
 * @since 21.0.0 2024-08-12
 */
public class RamStack implements MemoryAddress {

    private String variableName;

    private String referenceRamHeap;

    private String memoryReference;

    private List<Map<String, String>> referencesStack;

    public RamStack() {
    }

    public RamStack(String variableName, String referenceRamHeap, List<Map<String, String>> referencesStack, String memoryReference) {
        this.variableName = variableName;
        this.referenceRamHeap = referenceRamHeap;
        this.referencesStack = referencesStack;
        this.memoryReference = memoryReference;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getReferenceRamHeap() {
        return referenceRamHeap;
    }

    public void setReferenceRamHeap(String referenceRamHeap) {
        this.referenceRamHeap = referenceRamHeap;
    }

    public List<Map<String, String>> getReferencesStack() {
        return referencesStack;
    }

    public void setReferencesStack() {
        List<Map<String, String>> listOfReferences = new ArrayList<>();
        Map<String, String> referencesStack = new HashMap<>();
        String referenceRamHeapAndMemoryRenference = this.getReferenceRamHeap() + " [ " + this.getMemoryReference() + " ]";
        referencesStack.put(this.getVariableName(), referenceRamHeapAndMemoryRenference);
        listOfReferences.add(referencesStack);
        this.referencesStack = listOfReferences;
    }

    public String getMemoryReference() {
        return memoryReference;
    }

    public void setMemoryReference() {
        this.memoryReference = generateHexadecimalMemoryAddress();
    }

    @Override
    public String generateHexadecimalMemoryAddress() {
        return UUID.randomUUID().toString();
    }
}
