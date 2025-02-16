fun main () {
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
    println(digitize(847394))

}