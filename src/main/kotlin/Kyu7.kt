/* Q1. Given the triangle of consecutive odd numbers:
          1
       3     5
    7     9    11
13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8   */

fun rowSumOddNumbers(n: Int): Int {
//        first number =n^2 - (n - 1)
//        sum of all numbers = n^3
    return n * n * n
}


/* Q2. Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces. */

fun getVowelCount(str: String): Int {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    return str.filter { it in vowels }.length
}

fun main() {

//    println(rowSumOddNumbers(13))
    println(getVowelCount("Ibrahim"))
}