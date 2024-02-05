package abstracts_classes.example2;

/**
 * Practice Abstracts classes
 *
 * @author Alex T.H.
 * @version v0.4.1
 * @since 20.0.0 2024-02-05
 */
public enum WorkType {
    REMOTE("remote"),
    PRESENTIAL("presential"),
    HYBRID("hybrid");

    private final String valueName;

    WorkType(String valueName){
        this.valueName = valueName;
    }

    public String getValueName(){
        return valueName;
    }

}
