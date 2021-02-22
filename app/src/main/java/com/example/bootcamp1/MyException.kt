package com.example.bootcamp1

class MyException : Throwable(){
    fun throwException(message : String){
        throw NoClassDefFoundError(message)
    }
}