import kotlin.math.pow

fun main() {
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
//    println(digitize(847394))


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

    findSmallestInt(listOf(34, -345, -1, 100))

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

    println(bmi(100.0, 1.80))
}

