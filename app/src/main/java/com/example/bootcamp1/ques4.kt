package com.example.bootcamp1

//Ques 4 : Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters,
// Digits And Other Special Characters In A String

class ques4 {
    var x : String = ""

    fun percentage(text : String){
        var len : Float = (text.length).toFloat()
        var digit : Float = 0f
        var lower : Float = 0f
        var upper : Float = 0f
        var special : Float = 0f
        for(letter in text){
          if(letter.isDigit()){
              digit ++
          }else if(letter.isLowerCase()){
              lower ++
          }else if(letter.isUpperCase()){
              upper ++
          }else{
              special ++
          }
        }
        println(len)
        println("no and % of digits : " + digit + " " + ((digit/len) * 100) + "%")
        println("no and % of lowercase letters : " + lower + " " + ((lower/len) * 100) + "%")
        println("no and % of uppercase letters : " + upper + " " + ((upper/len) * 100) + "%")
        println("no and % of special characters : " + special + " " + ((special/len) * 100) + "%")
    }
}