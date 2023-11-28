package com.example.bankacccountcode

fun main() {
    val h = Account("Hassan",1300.0)
    h.depositMoney(200.0)
    h.withdrawMoney(300.0)
    h.transactionHistory()
    println("Remaining Balance is ${h.balance}")
}