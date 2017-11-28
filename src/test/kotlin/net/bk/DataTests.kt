package net.bk

import org.junit.Test

class DataTests {


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


    }

}