package com.example.bankacccountcode

fun main() {
    /*
    val h = Account("Hassan",1300.0)
    h.depositMoney(200.0)
    h.withdrawMoney(300.0)
    //h.transactionHistory()
    println("Remaining Balance is ${h.acctBalance()}")
    */

    val s = Account("Sarah",0.0)
    s.depositMoney(100.0)
    s.withdrawMoney(10.0)
    s.depositMoney(300.0)
    s.transactionHistory()
    println("Account Balance is ${s.acctBalance()}")


}