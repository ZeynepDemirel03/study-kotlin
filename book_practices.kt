//Write an extension function called isPositive that takes an integer and checks whether it is positive. fun Int.

fun Int.isPositive(): Boolean = this > 0

/*Write an extension function called toLowercaseString that takes a string and returns a lowercase version. Hint
Use the .lowercase() function for the String type.*/

fun String.toLowercaseString(): String = this.lowercase()

fun main() {
    println(1.isPositive())
    println("Hello World!".toLowercaseString())
}
