package net.bk



abstract class Comparable<in T> {

    abstract fun compareTo(other: T): Int
}


class NumberComparable : Comparable<Number>() {
    override fun compareTo(other: Number): Int = 5

}

class DoubleComparable : Comparable<Double>() {
    override fun compareTo(other: Double): Int = 4

}


fun demoCovarience(x: Comparable<Number>) {
    x.compareTo(1.0) // 1.0 has type Double, which is a subtype of Number
    // Thus, we can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!
}



fun demoContraVarience(x: Comparable<Double>){
    x.compareTo(1.2)
    val y : Comparable<Number> = x as Comparable<Number>


//    val deferred = (1..1_000_000).map { n ->
//        async {
//            n
//        }
//    }
}


fun main(args: Array<String>) {

    val x = NumberComparable()
    val y = DoubleComparable()
    demoCovarience(x)
    demoContraVarience(x)
    demoContraVarience(y)
}