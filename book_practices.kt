package kotlinog
import kotlin.math.PI
//Write an extension function called isPositive that takes an integer and checks whether it is positive. fun Int.

fun Int.isPositive(): Boolean = this > 0

/*Write an extension function called toLowercaseString that takes a string and returns a lowercase version. Hint
Use the .lowercase() function for the String type.*/

fun String.toLowercaseString(): String = this.lowercase()

/*
Exercise 1
You have a program that counts pizza slices until there's a whole pizza with 8 slices.
Refactor this programin twoways:
Use a while loop.
Use a do-while loop.*/
fun pizza (){
    var pizzaslices = 0
    do {
        println("there is only ${pizzaslices} pizza slices")
        pizzaslices++
    }while (pizzaslices <8)
    println("There are $pizzaslices slices of pizza. Hooray! We have a whole pizza! :D")
}
/*
Exercise 2
Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
replacing any number divisible by three with the word "fizz", and any number divisible by five with the word "buzz".
Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz". Hint 1
Use a for loop to count numbers and a when expression to decide what to print at each step. Hint 2
Use the modulo operator ( % ) to return the remainder of a number being divided. Use the equality operator ( ==)
to check if the remainder equals zero.*/
fun fizzbuzz(){
    for (number in 1..100){
        println(
            when{
                number % 15 == 0 -> "FizzBuzz "
                number % 3 == 0 -> "Fizz "
                number % 5 == 0 -> "Buzz "
                else -> "$number"
            }
        )
    }
}

/*Exercise 3
You have a list of words. Use for and if to print only the words that start with the letter l . Hint
Use the .startsWith() function for String type.*/
fun lword() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words){
        if (word.startsWith("l")){
            println(word)
        }
    }
}

/*Exercise 4
Write a function called circleArea that takes the radius of a circle in integer format as a parameter and outputs the area of that circle.
Hint
The formula for calculating the area of a circle is , where is the radius. */

fun circleArea(radius:Int):Int{
    val area = PI * radius * radius
    return area.toInt()
}

/*Exercise 5
Rewrite the circleArea function from the previous exercise as a single-expression function.*/
fun circleArea2(radius:Int): Double = PI * radius * radius

/*Exercise 6
You have a function that translates a time interval given in hours, minutes, and seconds into seconds. In most
cases, you need to pass only one or two function parameters while the rest are equal to 0. Improve the function
and the code that calls it by using default parameter values and named arguments so that the code is easier to read.*/

fun timer(hour:Int, minutes:Int, seconds:Int) = ((hour*60)+minutes)*60+seconds

/*Exercise 7
You have a list of actions supported by a web service, a common prefix for all requests, and an ID of a particular
resource. To request an action title over the resource with ID: 5, you need to create the following URL:
https://example.com/book-info/5/title . Use a lambda expression to create a list of URLs from the list of
actions.*/
fun acts(){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}

/*Exercise 8
Write a function that takes an Int value and an action (a function with type () -> Unit ) which then repeats
the action the given number of times. Then use this function to print “Hello” 5 times.*/

fun repeat(n: Int, action: () -> Unit) {
    for (i in 1 ..n) {
        action()
    }
}

fun main() {
    println(1.isPositive())
    println("Hello World!".toLowercaseString())
    pizza()
    fizzbuzz()
    lword()
    println(circleArea(2))
    println(circleArea2(2))
    println(timer(hour = 17, minutes = 23, seconds = 67))
    acts()
    repeat(5,{
        println("hello")
    })
}
