package net.bk

import org.junit.Test

// Kotlin doesn't have wildcard types, it has declaration-site variance and type projections

class GenericTests{
    class Box<T>(t: T) {
        var value = t
    }

    @Test
    fun testBox(){
        var x = Box("String")
        var y = Box(1)
    }

}