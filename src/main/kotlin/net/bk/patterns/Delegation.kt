package net.bk.patterns

//https://en.wikipedia.org/wiki/Delegation_pattern
//In software engineering, the delegation pattern is an object-oriented design pattern
// that allows object composition to achieve the same code reuse as inheritance.

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }

    fun throwSomething() : Unit = throw Exception("oops")
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val x = BaseImpl(10)
    val d = Derived(x)
    x.throwSomething()
    d.print() // prints 10
}