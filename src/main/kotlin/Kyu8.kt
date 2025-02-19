import kotlin.math.pow

//    1.)
fun digitize(n: Long): IntArray {
    // Code here
//       convert the number to string
    val convertedToString = n.toString()
//       map each character to an integer
    val mappedToInteger = convertedToString.map { it.toString().toInt() }
//       reversed list
    val reversedOrder = mappedToInteger.reversed()
    return reversedOrder.toIntArray()
// val reversedArr = n.toString().map {it.toString().toInt() }.reversed().toIntArray()
}
/* 2.) Given an array of integers your solution should find the smallest integer.
For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.  */

//    1. loop over the array and compare the num in current iteration to previous number
fun findSmallestInt(nums: List<Int>): Int {
    var smallest = nums[0]
    for (num in nums) {
//            compare the current number to the previous
        if (num < smallest) {
            smallest = num

        }
    }
//        println(smallest)
//        println(nums.sortedDescending())
    return smallest
}


/* 3.) Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
*/
fun bmi(weight: Double, height: Double): String {
    val calculatedValue = weight / height.pow(2)
//        println(calculatedValue)
//        solution 1
//        if (calculatedValue <= 18.5) {
//            return "Underweight"
//        } else if (calculatedValue <= 25.0) {
//            return "Normal"
//        } else if (calculatedValue <= 30.0) {
//            return "Overweight"
//        } else return "Obese"

//        solution 2.
    return when {
        calculatedValue <= 18.5 -> "Underweight"
        calculatedValue <= 25.0 -> "Normal"
        calculatedValue <= 30.0 -> "Overweight"
        else -> "Obese"
    }

}

/* Q4. Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9
 */
fun squareSum(n: Array<Int>): Int {
    //1. square each number in 'n' Array
//2. sum all of the squares
    var sum = 0

    for (number in n) {
        sum += number * number // square each number and add it to sum
    }
//    return sum

//    alternative solution
    return n.map { it * it }.sum()

}

fun mapFunction(): List<String> {
    val names = arrayOf("Kofi", "Adwoa", "Ama", "Yaw")

    return names.map({ name -> name })
//    return names.map { it }

}


/*  Q5. Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.  */

fun evenOrOdd(number: Int): String {
    return when {
        number % 2 == 0 -> "Even"
        else -> {
            "Odd"
        }
    }
}

/* Q6. Write a function that removes all vowels from a given string and returns the new string. */

fun removeVowels(word: String): String {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
//    1. Convert string to list of characters
    val convertedWord = word.split("")
//    2. Remove all vowels from the list.
    return word.filter { it !in vowels } // return only non vowels
}

fun main() {

//    println(digitize(847394)) // Q1
//    findSmallestInt(listOf(34, -345, -1, 100)) // Q2
//    println(bmi(100.0, 1.80)) // Q3
//    println(squareSum(arrayOf(1, 2, 2)))
//    println(mapFunction())
//    println(evenOrOdd(4))

    println(removeVowels("Saddik"))
}



