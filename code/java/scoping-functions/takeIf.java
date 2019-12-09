public void displaySubstringPosition(String input, String sub) {
    val index = input.indexOf(sub)
    if (index >= 0) {
        System.out.println("The substring " + sub + "is found in " + input + ".")
        System.out.println("Its start position is " + index + ".")
    }
}