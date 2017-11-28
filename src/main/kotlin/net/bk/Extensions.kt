package net.bk

data class Customer(val id:Int, val name:String)

data class Customers(var cusomters : MutableList<Customer>){
    fun addCustomer(cust :Customer){
        this.cusomters.add(element = cust)
    }
}
operator fun Customers.get(index : Int) : Customer? =  this.cusomters?.get(index)
operator fun Customers.plusAssign(cust : Customer) =  this.addCustomer(cust)



inline fun Customer.promote(){
    println("hello and welcome")
}

fun main(args: Array<String>) {
    val cust = Customer(9416404,name = "brian")
    cust.promote()

    var custArray = mutableListOf<Customer>()
    val customers = Customers(custArray)

    customers += cust
    var myCust = customers[0]

}