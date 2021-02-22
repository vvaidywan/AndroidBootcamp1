package com.example.bootcamp1

//Ques 3 : WAP to create sealed Base class and 3 subclasses of Base class, write a function which
// will have base class object as an argument and it will return name of the subclass based argument type.
sealed class Base {
    var name = "Varsha"
    var age = 21

    fun printSubClassName(base : Base){
        println("The name of the sub class is : ${base.javaClass}")
    }
}

class SubA : Base(){

}
class SubB : Base(){

}
class SubC : Base(){

}