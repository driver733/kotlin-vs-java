val original = "abc"
// Map the value and send to the next chain
original.let {
    println("The original String is $it") // "abc"
    it.reversed() // map it as parameter to send to next let
}.let {
    println("The reverse String is $it") // "cba"
    it.length  // can be evolved to other type
}.let {
    println("The length of the String is $it") // 3
}