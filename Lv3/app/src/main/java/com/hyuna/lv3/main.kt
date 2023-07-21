package com.hyuna.lv3

fun main() {
    var calc = Calculator()
    print("첫번째 숫자를 입력하세요: ")
    calc.num1 = readLine()!!.toDouble()
    print("두번째 숫자를 입력하세요: ")
    calc.num2 = readLine()!!.toDouble()

    var addoperation = AddOperation()
    addoperation.add()
}
