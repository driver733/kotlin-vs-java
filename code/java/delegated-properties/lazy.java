private String value;

public synchronized String getValue() {
    if (value == null) {
        value = "Something";
    }
    return value;
}