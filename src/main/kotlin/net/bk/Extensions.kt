package net.bk

data class Customer(val id:Int, val name:String)


fun Customer.promote(){
    println("hello and welcome")
}

fun main(args: Array<String>) {
    val cust = Customer(2,name = "brian")
    cust.promote()
}