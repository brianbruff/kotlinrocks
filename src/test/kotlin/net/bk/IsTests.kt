package net.bk

import org.junit.Test
import org.junit.internal.runners.statements.ExpectException
import kotlin.test.assertTrue


class IsTests {

    @Test
    fun isCastTest(){
        val obj : Any = "Hi"

        if (obj is String)
            println(obj.length) // no cast to String is needed
    }

}