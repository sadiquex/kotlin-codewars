/* Q1.
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0.
Note: If the number is a multiple of both 3 and 5, only count it once. */

fun sumOfMultiples(number: Int): Int {
//    if (number < 0) return 0
//    var sum = 0
//
////    Loop through all numbers from 0 to n-1.
//    for (i in 0 until number) {
////    Check if each number is divisible by 3 or 5 using the modulus operator (%).
//        if (i % 3 == 0 || i % 5 == 0) {
//            sum += i
//        }
//
//    }
//
//    return sum

//    ALTERNATIVE
    return (0 until number) // Loop from 0 to n-1
        .filter { it % 3 == 0 || it % 5 == 0 } // Keep only multiples of 3 or 5
        .sum() // Sum the filtered numbers

}

fun main() {

    println(sumOfMultiples(20))
}

