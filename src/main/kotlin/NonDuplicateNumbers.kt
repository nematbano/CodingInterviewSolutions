package org.example

class NonDuplicateNumbers {

    fun main(){
        var arr = intArrayOf(2, 3, 3, 3, 6, 9, 9)
        println(remove(arr)) // Output: 4 (Non-duplicate elements: 2, 3, 6, 9)

        arr = intArrayOf(2, 2, 2, 11)
        println(remove(arr))
    }

    private fun remove(arr: IntArray): Int {
        var nextNonDuplicate = 1 // Initialize the index of the next non-duplicate element

        // Iterate through the array starting from the second element
        for (i in 1 until arr.size) {
            // Check if the current element is different from the previous non-duplicate element
            if (arr[nextNonDuplicate - 1] != arr[i]) {
                // If different, copy the current element to the nextNonDuplicate position
                arr[nextNonDuplicate] = arr[i]
                // Increment the index of the next non-duplicate element
                nextNonDuplicate++
            }
        }


        // Return the length of the modified array (number of non-duplicate elements)
        return nextNonDuplicate

    }
}