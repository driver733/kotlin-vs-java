fina var original = "abc"
// Map the value and send to the next chain

Optional.of(original)
        .map(
            str -> {
                System.out.println("The original String is " + str); // "abc"
                val result = new StringBuilder(input).reverse().toString();
                return result;
            }
        ).map(
            reversed -> {
                System.out.println("The reverse String is " + reversed); // "cba"
                val result = reversed.length();
                return result;
            }
        ).map(
            length -> {
                System.out.println("The length of the String is " + length); // 3
                return length;
            }
        )