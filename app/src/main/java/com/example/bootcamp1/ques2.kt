package com.example.bootcamp1

import java.util.regex.Pattern

//Ques 2 : Write a program to find the number of occurrences of the duplicate words in a
// string and print them.

class ques2 {
    var x : String = ""

    fun countMatches(string: String, pattern: String): Int {
        val matcher = Pattern.compile(pattern).matcher(string)

        var count = 0
        while (matcher.find()) {
            count++
        }
        return count
    }

    fun printDuplicates() {
        val str = "hello varsha welcome hello varsha here you are here"
        val words = str.split(" ")

        var i = 0
        while (i < words.size-1) {
            var j = i+1
            var duplicateWord: String? = null
            var duplicateWordCount = 1
            while (j < words.size) {
                if (words[i] == words[j]) {
                    duplicateWord = words[i]
                    duplicateWordCount++
                }
                j++
            }
            if (duplicateWord != null) {
                println("Duplicate word: $duplicateWord, Occurences: $duplicateWordCount")
            }
            i++
        }
    }

}
