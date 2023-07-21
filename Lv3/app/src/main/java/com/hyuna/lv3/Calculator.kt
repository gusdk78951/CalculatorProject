package com.hyuna.lv3

open class Calculator {  // open을 사용해서 부모 클래스로 만들어줌
    var num1 : Double = 0.0
    var num2 : Double = 0.0

    open fun add(){
        var add  = num1 + num2
        println("$add")
    }
}
