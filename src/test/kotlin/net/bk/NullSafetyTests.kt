package net.bk

import org.junit.Test
import kotlin.test.assertTrue


class NullSafetyTests{

    @Test fun basicNullTests(){
        var a: String = "abc"
        //a = null // compilation error

        var b: String? = "abc"
        b = null // ok

        var l = a.length // safe

       // l = b.length  //  Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

        val ll = b?.length // save call

        // check tracked by compiler
        val llll = if (b != null) b.length else -1  // notice inline assignment


        if (b != null && b.length > 0) {
            print("String of length ${b.length}")
        } else {
            print("Empty string")
        }

        // Safe call chaining
        //val x = b?.department?.head

    }

    @Test
    fun letWithNulls(){
        // let with nulls
        val listWithNulls: List<String?> = listOf("A", null, "B")
        for (item in listWithNulls) {
            item?.let { println(it) } // prints A and ignores null
        }
    }


    @Test (expected = Exception::class)
    fun elvisOperator(){
        var b : String? = null
        val l = b?.length ?: -1
        println(l)

        // throw elvis
        var x = b?.length ?: throw Exception("oops")
    }

    @Test( expected = NullPointerException::class)
    fun showMeAnNPE(){
            var b : String? = null
            val l = b!!.length

    }

    @Test (expected = ClassCastException::class)
    fun unsafeCast(){
        val a : String? = null
        val aInt: Int? = a as Int
    }

    @Test
    fun safeCast(){
        val a : String? = null
        val aInt: Int? = a as? Int
        print(aInt)
    }

    @Test
    fun filterNull(){
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        val found  = nullableList.find { x -> x == 2 }

        assertTrue(intList.size == 3)

    }


}