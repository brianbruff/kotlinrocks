package net.bk

import org.junit.Test

class LazyTests {

    class LazySample {
        val lazy: String by lazy {
            println("computed!")
            "my lazy"
        }
    }



    @Test
    fun lazyTest() {
        val sample = LazySample()
        println("lazy = ${sample.lazy}")
        println("lazy = ${sample.lazy}")

    }

}