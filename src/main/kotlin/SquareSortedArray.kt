package org.example

class SquareSortedArray {
    fun main() {
        val arr = intArrayOf(-6, -3, -1, 2, 4, 5)
        val n = arr.size

        println("Before sort ")
        for (i in 0 until n) print(arr[i].toString() + " ")

        val result = sortSquares(arr)
        println("")
        println("After Sort ")
        for (i in 0 until n) print(result[i].toString() + " ")
    }

    private fun sortSquares(arr: IntArray): IntArray {
        val n = arr.size
        var left = 0
        var right = n - 1
        var index = n-1

        val result = IntArray(n)

        while (left <= right)  {
            val leftSquare = arr[left] * arr[left] // Calculate the square of the value at the left pointer.
            val rightSquare = arr[right] * arr[right]
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare
                left++
            } else {
                result[index--] = rightSquare
                right--
            }
        }
        return result
    }
}