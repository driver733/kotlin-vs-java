if (nullableVariable != null) {
    boolean success = nullableVariable.someMethodCall();
    if (success) {
        return success;
    } else {
        return fallbackIfNullMethodCall();
    }
} else {
    return fallbackIfNullMethodCall();
}