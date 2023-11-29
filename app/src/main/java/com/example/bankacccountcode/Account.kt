package com.example.bankacccountcode

import java.time.temporal.TemporalAmount

class Account (
    var accountHolder: String,
    var balance: Double)
{

    private val transHist = mutableListOf<String>()


    fun depositMoney(amount: Double){
        balance += amount
        transHist.add("$accountHolder deposited $$amount")
    }

    fun withdrawMoney(amount:Double)
    {
        if (balance > amount)
        {
            balance -= amount
            transHist.add("$accountHolder Withdrew $$amount")
        }
        else{
            println("YOU CAN'T PROCESSED THIS TRANSACTION! DUE TO INSUFFICIENT FUNDS")
            transHist.add("TRANSACTION CANCELLED!")
        }

    }

    fun transactionHistory(){
        println("Transaction History For $accountHolder")
        for (transaction in transHist)
            println(transaction)
    }
    fun acctBalance(){
        println(balance)
    }

}