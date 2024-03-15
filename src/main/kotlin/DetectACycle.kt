package org.example

fun main() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    val node4 = Node(value = 4)
    val node5 = Node(value = 5)
    val node6 = Node(value = 6)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = null

    println(hasCycle(node1))

}

fun hasCycle(head: Node): Boolean {
    var slow: Node? = head // Initialize a slow pointer to the head of the linked list.
    var fast: Node? = head // Initialize a fast pointer to the head of the linked list.
    while (fast?.next != null) { // Iterate through the linked list.
        fast = fast.next?.next // Move the fast pointer two steps at a time.
        slow = slow?.next // Move the slow pointer one step at a time.
        if (slow == fast) // Check if the slow and fast pointers meet, indicating a cycle.
            return true // Found a cycle, return true.
    }
    return false // No cycle found, return false.
}


data class Node(var value: Int, var next: Node? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}