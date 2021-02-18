package com.example.bootcamp1

// Ques1 : Write a program to print your Firstname,LastName & age using init block,companion object.
class q1{
    var firstName : String = "Varsha"
    var lastName : String = "Vaidywan"
    var age : Int = 21
    init{
        println("through init : " + firstName)
        println("through init : " + lastName)
        println("through init : " + age)
    }
    companion object {
        const val first : String = "vishakha"
        const val last : String = "Vaidywan"
        const val age1 : Int = 26
    }
    fun print(){
        println("through companion object : " + q1.first)
        println("through companion object : " + q1.last)
        println("through companion object : " + q1.age1)
    }
}


// Ques2 : Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String
class q2 {
    var a: Int = 10
    var b: Int = 20
    var c: Double = 35.67
    var d: Double = 12.3
    var str1: String = "hello this is ..."
    var str2: String = "Varsha !!"
    var str3: String = "...How u doin"

    fun function(a: Int, b: Int) {
        var sum: Int = a + b
        println("Addition of 2 int nos " + a + " and " + b + " is : " + sum)
    }

    fun function(c: Double, d: Double) {
        var sum: Double = c + d
        println("Addition of 2 double nos " + c + " and " + d + " is : " + sum)
    }

    fun function() {
        var ans: Int = a * b
        println("Multiplication of 2 int nos " + a + " and " + b + " is : " + ans)
    }

    fun function(str1: String, str2: String) {
        var ans: String = str1 + str2
        println("After Concatenation : " + ans)
    }

    fun function(str1: String, str2: String, str3: String) {
        var ans: String = str1 + str2 + str3
        println("After Concatenation : " + ans)
    }
}


    // Ques3 : Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
    // which provide there specific details like rateofinterest etc,print details of every bank.
    open class bank{
        var type : String = "head"
        open fun getDetails(){
            println("bank : type - " + type)
        }
    }

    class SBI : bank(){
        var rateOfInterest : Double = 6.6
        var subtype : String = "sub"
        override fun getDetails(){
            println("SBI : " + "roi - " + rateOfInterest + "type - " + subtype)
        }
    }

    class BOI : bank(){
        var rateOfInterest : Double = 7.0
        var subtype : String = "sub"
        override fun getDetails(){
            println("BOI : " + "roi - " + rateOfInterest + "type - " + subtype)
        }
    }

    class ICICI : bank(){
        var rateOfInterest : Double = 5.8
        var subtype : String = "sub"
        override fun getDetails(){
            println("ICICI : " + "roi - " + rateOfInterest + "type - " + subtype)
        }
    }


// Ques4 : Create Kotlin classes having suitable attributes for Library management system.Use OOPs
// concepts in your design.Also try to use interfaces and abstract classes.

open abstract class account{
    var id : Int = 0
    var designation : String = ""
    open fun setId(){}
    open fun setDesig(){}
}
class student : account(){
    override fun setId(){
        id = 1
    }
    override fun setDesig() {
        designation = "student"
    }
}
interface book {
    var name : String
    var author : String
    fun setName(){}
}
class library : book{
    override var name : String = ""
    override var author : String = ""
    override fun setName(){
        name = "Intro to programming"
    }
}


// Ques5 : Write a function which take marks as an argument and return the the grade as follows:
//marks between 50 to 60 , return “Good”
//marks between 60 to 70, return “Very Good”
//marks between 70 to  80, return “Excellent”
//marks between  80 to 100, return “Rockstar”
class marks{
    var m : Int = 0
    fun marksCalculation(m : Int){
        val grade = when(m){
           in 50..60 -> "Good"
           in 61..70 -> "Very Good"
           in 71..80 -> "Excellent"
           in 81..100 -> "Rockstar"
            else -> "okay u need to work"
        }
        println("Grade assigned for marks = " + m + " : " + grade)
    }
}


//Ques6 : Write a program to create mutable list of Integer. replace the second item in the list
// with new value. Print the list value.
class q6{
    fun doit(){
       val l : MutableList<Int> = mutableListOf(1, 2, 3, 4)
        l[1] = 10
        for(items in l){
            println(items)
        }
    }
}


//Ques7 : Write a program to create mutable map. print all the value and key of map.
class q7{
    fun func(){
        val map : MutableMap<Int, String> = mutableMapOf(1 to "varsha", 2 to "vinay", 3 to "vishu")
        for(item in map){
            println("key : " + item.key + ", value : " + item.value)
        }
    }
}


// Ques8 : Write a program to create HasSet. print all the value.
class q8{
    fun func(){
        val hashSet : HashSet<Int> = hashSetOf(10, 20, 30, 40, 50)
        for(items in hashSet){
            println(items)
        }
    }
}




