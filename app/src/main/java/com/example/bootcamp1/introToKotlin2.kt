package com.example.bootcamp1

class abc{
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
        println("through companion object : " + abc.first)
        println("through companion object : " + abc.last)
        println("through companion object : " + abc.age1)
    }
}

//class util{
//    var a = abc()
//    a.print()
//}
