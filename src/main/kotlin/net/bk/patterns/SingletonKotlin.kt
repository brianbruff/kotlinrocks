package net.bk.patterns


// singleton practise , readonly
object SingletonKotlin{
    val property = "Something"
}

fun main(args: Array<String>) {
    val x = SingletonKotlin.property
}