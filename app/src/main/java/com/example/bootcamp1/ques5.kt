package com.example.bootcamp1

// Ques 5 : Find common elements between two arrays

class ques5 {
    var x : String = ""

    fun common() {
        val arr1 = intArrayOf(4, 7, 3, 9, 2)
        val arr2 = intArrayOf(3, 2, 12, 9, 40, 32, 4)
        for (i in arr1.indices) {
            for (j in arr2.indices) {
                if (arr1[i] == arr2[j]) {
                    println(arr1[i])
                }
            }
        }
    }
}