package tr.com.jowl.utils;

/**
 * The TaskCategories Enum class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
public enum TaskCategories {
    MEETING("MEETING"),
    PROJECT("PROJECT"),
    SHOPPING("SHOPPING"),
    LESSON("LESSON"),
    OUTDOOR("OUTDOOR");
    private String value;

    TaskCategories(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
