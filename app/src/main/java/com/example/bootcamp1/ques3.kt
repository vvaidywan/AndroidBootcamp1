package com.example.bootcamp1

//Ques 3 : Write a program to find the number of occurrences of a character in a string
// without using loop

class ques3 {
    var x : String = ""

    fun countOccurrences(s: String, ch: Char): Int {
        return s.filter { it == ch }.count()
    }
}