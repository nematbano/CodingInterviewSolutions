package org.example

import java.util.*


fun threeSum(nums: IntArray): List<List<Int>> {
    val ans: MutableList<List<Int>> = ArrayList()

    // Sort the array
    nums.sort()

    for (i in 0 until nums.size - 2) {
        // Skip duplicate elements for i
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue
        }

        var j = i + 1
        var k = nums.size - 1

        while (j < k) {
            val sum = nums[i] + nums[j] + nums[k]

            if (sum == 0) {
                // Found a triplet with zero sum
                ans.add(listOf(nums[i], nums[j], nums[k]))

                // Skip duplicate elements for j
                while (j < k && nums[j] == nums[j + 1]) {
                    j++
                }

                // Skip duplicate elements for k
                while (j < k && nums[k] == nums[k - 1]) {
                    k--
                }

                // Move the pointers
                j++
                k--
            } else if (sum < 0) {
                // Sum is less than zero, increment j to increase the sum
                j++
            } else {
                // Sum is greater than zero, decrement k to decrease the sum
                k--
            }
        }
    }
    return ans
}

fun main() {
    val arr = intArrayOf(-6, -3, -1, 2, 4, 5)
    val n = arr.size

    println("Before 3 sum ")
    for (i in 0 until n) print(arr[i].toString() + " ")

    val result = threeSum(arr)
    println("")
    println("After 3 sum ")
    for (element in result) print("$element ")
}