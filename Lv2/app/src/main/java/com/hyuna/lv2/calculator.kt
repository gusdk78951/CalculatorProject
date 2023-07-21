package com.hyuna.lv2

fun main() {
    var calculator = Calculator()
    print("첫번째 숫자를 입력하세요: ")
    var num1 = readLine()!!.toDouble()
    print("원하는 연산을 입력하세요: ")
    var operator : String = readLine()!!.toString()
    print("두번째 숫자를 입력하세요: ")
    var num2 = readLine()!!.toDouble()

    if (operator == "+"){
        calculator.addition(num1, num2)
    }
    else if (operator == "-"){
        calculator.subtract(num1, num2)
    }
    else if (operator == "*"){
        calculator.multiply(num1, num2)
    }
    else if (operator == "/"){
        calculator.divide(num1, num2)
    }
}

class Calculator {
    fun addition(num1:Double, num2:Double){
        var add = num1 + num2
        println("$add")
    }
    fun subtract(num1:Double, num2:Double){
        var sub = num1 - num2
        println("$sub")
    }
    fun multiply(num1:Double, num2:Double){
        var mul = num1 * num2
        println("$mul")
    }
    fun divide(num1:Double, num2:Double){
        var div = num1 / num2
        println("$div")
    }
}