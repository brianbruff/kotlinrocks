package net.bk;

import org.junit.Test

class FunctionAddressTests {
    fun isOdd(x: Int) = x % 2 != 0
    fun length(s: String) = s.length

    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
        return { x -> f(g(x)) }
    }

    @Test
    fun test() {


       val oddLength = compose(::isOdd, ::length)
       val strings = listOf("a", "ab", "abc")
       println(strings.filter(oddLength))
       strings.filter{s -> s.length % 2 == 1}



    }



}
