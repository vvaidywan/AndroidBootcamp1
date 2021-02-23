package com.example.bootcamp1

fun listOfEmployees() {
    val emp = mutableListOf<Pair<Int, String>>();
    emp.add(0, Pair(21, "Varsha"))
    emp.add(1, Pair(27, "Vishakha"))
    emp.add(2, Pair(33, "Alok"))
    emp.add(3, Pair(23, "Vinay"))
    emp.add(4, Pair(39, "Sujeet"))

    val filteredEmp = emp.filter { it.first > 30 }

    for (elements in filteredEmp) {
        println("Employee age and name : $elements")
    }
}