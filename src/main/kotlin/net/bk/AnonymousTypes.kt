package net.bk


fun foo() {
    val adHoc = object {
        var x: Int = 1
        var y: Int = 1
    }
    print(adHoc.x + adHoc.y)
}


fun main(args: Array<String>) {
    foo()
}


open class A(x: Int) {
    open val y: Int = x
}

interface B {}

val ab: A = object : A(1), B {
    override val y = 15
}





//NOTE:
// anonymous objects can be used as types only in local and private declarations
class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
        //val x2 = publicFoo().x  // ERROR: Unresolved reference 'x'
    }
}


// closure, note no final pinning

fun countClicks(window: JComponent) {
    var clickCount = 0
    var enterCount = 0

    window.addMouseListener(object : MouseAdapter {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }

        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }
    })
}





interface JComponent{
    fun addMouseListener(adapter : MouseAdapter)
}
interface MouseAdapter{
    fun mouseClicked(e:MouseEvent) {}
    fun mouseEntered(e:MouseEvent) {}
}
data class MouseEvent(val x :Int, val y :Int)