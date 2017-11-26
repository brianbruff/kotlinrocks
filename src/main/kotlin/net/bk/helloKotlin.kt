package net.bk



fun main(args: Array<String>){

    var x=1
    var y = 2
    println("$x + $y = ${add(x,y)}")
    println("$x + $y +5 = ${add(x,y,5)}")

}

//fun add(x : Int, y:Int) = x +y;
fun add(x : Int, y:Int, z:Int = 0) = x + y + z  // no need for overloading with default