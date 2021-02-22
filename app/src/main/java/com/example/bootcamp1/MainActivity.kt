package com.example.bootcamp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ques1 : WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
        // ClassNotFoundException
//        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver")
//        } catch (e: ClassNotFoundException) {
//            e.printStackTrace()
//        }
        // NoClassDefFoundError
//        val obj = MyException()
//        obj.throwException("This is my custom exception")



        //Ques2 : WAP to create singleton class
        //anonymous object because we're making it locally
        fun singleton(){
            val data = object{
                var x = 2
                var y = 5
            }
            println("data : " + data.x + " " + data.y)
        }
        //calling the singleton class which is not local
        println(singleton.name + singleton.age)



        //Ques3 : WAP to create sealed Base class and 3 subclasses of Base class, write a function
        // which will have base class object as an argument and it will return name of the subclass
        // based argument type.
        var obA = SubA()
        var obB = SubB()
        var obC = SubC()
        obA.printSubClassName(obA)
        obB.printSubClassName(obB)
        obC.printSubClassName(obC)



        //Ques4 : WAP to create extension function.
        fun String.removeFirst() : String = this.substring(1, this.length)

        var str = "varsha is awesome"
        println(str.removeFirst())
    }
}