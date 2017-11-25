package net.bk

import org.junit.Test

/**
 * Properties stored in a map. This comes up a lot in applications like parsing JSON
 * or doing other "dynamic" stuff. 
 */

class PropsInMapTests{
    class User(val map: Map<String, Any?>) {
        val name: String by map
        val age: Int     by map
    }

    @Test
    fun test() {
        val user = User(mapOf(
                "name" to "John Doe",
                "age"  to 25
        ))

        println("name = ${user.name}, age = ${user.age}")
    }
}