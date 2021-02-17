package com.example.bootcamp1

// Ques 6 : Check letter in string which do not have pair

class ques6 {

    var x : String = ""

    fun checkPair(seq : String){
        val arr = Array(26, {i -> i * 0})
        for(letter in seq){
            arr[letter.toInt() - 97] ++
        }
        for(i in arr.indices){
            if(arr[i] % 2 != 0 && arr[i] > 0){
                println((i + 97).toChar() + " does not have a pair")
            }

        }
    }

}