package tr.com.jowl.utils;

/**
 * The Roles Enum class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * Date 4/27/2018.
 */
public enum Roles {
    ROLE_ADMIN(1), ROLE_USER(2);
    private int value;

    Roles(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
