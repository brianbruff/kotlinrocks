package net.bk

import org.junit.Test

class LoopTests{

    @Test
    fun whileTest(){
        val args = listOf<String>("one", "two", "three")
        var i = 0
        while (i < args.size)
            println(args[i++])
    }

    @Test
    fun forTest(){
        for (i in 1 ..10)
            println(i)
    }

    @Test
    fun notIn(){
        val args = listOf<String>("10", "2", "3")
        val x = args[0].toInt()
        //Check if a number lies within a range:
        val y = 10
        if (x in 1..y - 1)
            println("OK")

        //Iterate over a range:
        for (a in 1..5)
            print("${a} ")

        //Check if a number is out of range:
        println()
        val array = arrayListOf<String>()
        array.add("aaa")
        array.add("bbb")
        array.add("ccc")

        if (x !in 0..array.size - 1)
            println("Out: array has only ${array.size} elements. x = ${x}")

        //Check if a collection contains an object:
        if ("aaa" in array) // collection.contains(obj) is called
            println("Yes: array contains aaa")

        if ("ddd" in array) // collection.contains(obj) is called
            println("Yes: array contains ddd")
        else
            println("No: array doesn't contains ddd")
    }
}