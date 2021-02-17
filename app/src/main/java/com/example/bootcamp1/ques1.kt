package com.example.bootcamp1

//Ques 1 : Write a program to replace a substring inside a string with another string.

class ques1 {
    var string : String = ""

    fun function(string : String, old : String, new : String){
        var output = string.replace(old, new)
        println(output)
    }
}
