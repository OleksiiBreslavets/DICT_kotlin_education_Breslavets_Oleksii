/**
 * Chatbot project: 1st practice program.
 *
 */

fun main() {
    try {
        // User introduces yourself
        print("\nHello! My name is DICT_Bot.\nPlease, remind me your name.\n> ")
        val name: String = readln()
        println("What a great name you have, $name!")  // Output the result

        // The program asks the user to guess his age and asks to enter the remainders from dividing the user's
        // age by 3, 5, and 7.
        println("\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")
        print("> ")
        val remainder3: Int = readln().toInt()
        print("> ")
        val remainder5: Int = readln().toInt()
        print("> ")
        val remainder7: Int = readln().toInt()
        val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
        println("Your age is $age!")  // Output the result

        // The program counts from 0 to any positive number entered by the user.
        print("\nNow I will prove to you that I can count to any number you want.\n> ")
        val endNumber: Int = readln().toInt()
        for (i in 1..endNumber) {
            println("$i!")  // Output the result
        }

        // The user is prompted to take the test.
        println(
            "\n" + """Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program."""
        )
        val rightAnswer = '2'
        print("> ")
        var userAnswer = readln().single()
        while (userAnswer != rightAnswer) {
            print("Please, try again.\n> ")
            userAnswer = readln().single()
        }
        println(
            """Completed, have a nice day!
Congratulations, have a nice day!"""
        )
    } catch (e: NumberFormatException) {print("Error value of input! Please run this program again.")}
}
