boolean result = nullableVariable == null

if (!result) {
    result = nullableVariable.someNullableMethodCall() || fallbackIfNullMethodCall()
} 
