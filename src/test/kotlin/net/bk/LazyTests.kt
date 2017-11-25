package net.bk

import org.junit.Test
import kotlin.reflect.KProperty

class LazyTests {


    class LazySample {
        val lazy: String by lazy {
            println("computed!")
            "my lazy"
        }
    }


    data class User(val name: String, val id: Int)

    fun getUser(): User {
        return User("Alex", 1)
    }

    @Test
    fun lazyTest() {
        val user = getUser()
        println("name = ${user.name}, id = ${user.id}")

        // or

        val (name, id) = getUser()
        println("name = $name, id = $id")

        // or

        println("name = ${getUser().component1()}, id = ${getUser().component2()}")


        val sample = LazySample()
        println("lazy = ${sample.lazy}")
        println("lazy = ${sample.lazy}")


    }

}