package net.bk

import org.junit.Test

class HashMapTransversalTests{

    @Test
    fun transverseTest(){
        val map = hashMapOf<String, Int>()
        map.put("one", 1)
        map.put("two", 2)

        for ((key, value) in map) {
            println("key = $key, value = $value")
        }
    }
}