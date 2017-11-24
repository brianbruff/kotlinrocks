package net.bk

import org.junit.Test
import kotlin.test.assertTrue


class DeconstructTests {
    @Test
    fun desconstructTest() {
        val pair = Pair(1, "one")

        val (num, name) = pair

        println("num = $num, name = $name")

        val dp = DataPair(1, "one")

        val (dpnu, dpna) = dp

        println("dpnu = $dpnu, dpna = $dpna")

        // note data classes also have other component functions
        //component functions, toString(), equals(), hashCode() and copy().
        println(dp.copy())
        println(dp.copy(2))
        println(dp.copy(first = 2))
        println(dp.copy(3, "Three"))
    }

    class Pair<K, V>(val first: K, val second: V) {
        operator fun component1(): K {
            return first
        }

        operator fun component2(): V {
            return second
        }
    }

    data class DataPair<K,V>(val first: K, val second: V)
}