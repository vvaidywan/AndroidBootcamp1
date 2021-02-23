package com.example.bootcamp1

//Ques1 : WAP using Lambda function to calculate the Simple Interest.
fun simpleInterest(){
    val simpleInterest = {amount : Int, rate : Int, years : Int -> (amount * rate * years)/100}
    println("simple interest : ${simpleInterest(5000, 10, 5)}")
}